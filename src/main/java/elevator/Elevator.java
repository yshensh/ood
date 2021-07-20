package elevator;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private final List<ElevatorButton> buttons;

    private final List<Boolean> upStops;
    private final List<Boolean> downStops;

    private int currentLevel;
    private Status status;

    private float currentWeight;
    private final float weightLimit;

    public Elevator(int n) {
        buttons = new ArrayList<ElevatorButton>();

        upStops = new ArrayList<Boolean>();
        downStops = new ArrayList<Boolean>();

        currentLevel = 0;
        status = Status.IDLE;

        weightLimit = 1000;

        for (int i = 0; i < n; i++) {
            upStops.add(false);
            downStops.add(false);
        }
    }

    private boolean noRequests(List<Boolean> stops) {
        for (int i = 0; i < stops.size(); i++) {
            if (stops.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void handleExternalRequest(ExternalRequest request) throws InvalidExternalRequestException {
        if (request.getDirection() == Direction.UP) {
            upStops.set(request.getLevel() - 1, true);
            if (noRequests(downStops)) {
                status = Status.UP;
            }
        } else if (request.getDirection() == Direction.DOWN) {
            downStops.set(request.getLevel() - 1, true);
            if (noRequests(upStops)) {
                status = Status.DOWN;
            }
        } else {
            throw new InvalidExternalRequestException("Invalid Request.");
        }
    }

    public void handleInternalRequest(InternalRequest request) {
        if (status == Status.UP) {
            if (request.getLevel() >= currentLevel + 1) {
                upStops.set(request.getLevel() - 1, true);
            }
        } else if (status == Status.DOWN) {
            if (request.getLevel() <= currentLevel + 1) {
                downStops.set(request.getLevel() - 1, true);
            }
        }
    }

    public void openGate() {
        if (status == Status.UP) {
            for (int i = 0; i < upStops.size(); i++) {
                int checkLevel = (currentLevel + i) % upStops.size();
                if (upStops.get(checkLevel)) {
                    currentLevel = checkLevel;
                    upStops.set(checkLevel, false);
                    break;
                }
            }
        } else if (status == Status.DOWN) {
            for (int i = 0; i < downStops.size(); i++) {
                int checkLevel = (currentLevel + downStops.size() - i) % downStops.size();
                if (downStops.get(checkLevel)) {
                    currentLevel = checkLevel;
                    downStops.set(checkLevel, false);
                    break;
                }
            }
        }
    }

    public void closeGate() throws OverWeightException {
        if (this.currentWeight > this.weightLimit) {
            throw new OverWeightException("Overweight.");
        }

        if (status == Status.IDLE) {
            if (noRequests(downStops)) {
                status = Status.UP;
            }
            if (noRequests(upStops)) {
                status = Status.DOWN;
            }
        } else if (status == Status.UP) {
            if (noRequests(upStops)) {
                if (noRequests(downStops)) {
                    status = Status.IDLE;
                } else {
                    status = Status.DOWN;
                }
            }
        } else {
            if (noRequests(downStops)) {
                if (noRequests(upStops)) {
                    status = Status.IDLE;
                } else {
                    status = Status.UP;
                }
            }
        }
    }

    public float getCurrentWeight() {
        return this.currentWeight;
    }

    public boolean isRequestValid(InternalRequest request) {
        if (status == Status.UP) {
            return request.getLevel() >= currentLevel + 1;
        } else if (status == Status.DOWN) {
            return request.getLevel() <= currentLevel + 1;
        }
        return false;
    }

}

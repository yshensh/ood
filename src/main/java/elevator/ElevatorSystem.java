package elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

    private final int numElevators = 3;
    private List<Elevator> elevators;
    private HandleRequestStrategy strategy;

    public ElevatorSystem(int n) {
        elevators = new ArrayList<Elevator>();
        for (int i = 0; i < numElevators; i++) {
            elevators.add(new Elevator(n));
        }
    }

    public void handleRequest(ExternalRequest request) throws InvalidExternalRequestException {
        this.strategy.handleRequest(request, elevators);
    }

    public void setStrategy(HandleRequestStrategy strategy) {
        this.strategy = strategy;
    }
}

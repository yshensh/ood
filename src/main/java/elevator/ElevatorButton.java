package elevator;

public class ElevatorButton {
    private final int level;
    private final Elevator elevator;

    public ElevatorButton(int level, Elevator elevator) {
        this.level = level;
        this.elevator = elevator;
    }

    public void pressButton() {
        InternalRequest request = new InternalRequest(this.level);
        elevator.handleInternalRequest(request);
    }
}

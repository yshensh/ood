import elevator.*;
import org.junit.Test;

public class ElevatorTest {

    @Test
    public void testElevatorSystem() throws InvalidExternalRequestException {
        ElevatorSystem elevatorSystem = new ElevatorSystem(5);
        elevatorSystem.setStrategy(new PeakHourHandleRequestStrategy());
        ExternalRequest request = new ExternalRequest(3, Direction.UP);
        elevatorSystem.handleRequest(request);
    }
}

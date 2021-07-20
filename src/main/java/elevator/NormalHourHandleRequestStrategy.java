package elevator;

import java.util.List;
import java.util.Random;

public class NormalHourHandleRequestStrategy implements HandleRequestStrategy {

    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> evelators) throws InvalidExternalRequestException {
        Random rand = new Random();
        evelators.get(0).handleExternalRequest(request);
    }
}

package elevator;

import java.util.List;
import java.util.Random;

public class PeakHourHandleRequestStrategy implements HandleRequestStrategy {
    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> evelators) throws InvalidExternalRequestException {
        Random rand = new Random();
        int n = rand.nextInt(evelators.size());
        evelators.get(n).handleExternalRequest(request);
    }
}

package elevator;

import java.util.List;

public interface HandleRequestStrategy {
    void handleRequest(ExternalRequest request, List<Elevator> evelators) throws InvalidExternalRequestException;
}

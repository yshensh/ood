package elevator;

public class InvalidExternalRequestException extends Exception {
    public InvalidExternalRequestException(String errorMessage) {
        super(errorMessage);
    }
}

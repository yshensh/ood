package elevator;

public class OverWeightException extends Exception {
    public OverWeightException (String errorMessage) {
        super(errorMessage);
    }
}

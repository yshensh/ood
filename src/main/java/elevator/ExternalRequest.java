package elevator;

public class ExternalRequest extends Request {

    private final Direction direction;

    public ExternalRequest(int level, Direction direction) {
        super(level);
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}

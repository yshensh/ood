package kindle;

public class Book {
    private final Format format;

    public Book(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }
}

package kindle;

public class MobiReader extends EBookReader {

    public MobiReader(Book book) {
        super(book);
    }

    @Override
    public String readBook() {
        return "book content is: mobi";
    }

    @Override
    public String displayReaderType() {
        return "Using MOBI reader";
    }

}

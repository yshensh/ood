package kindle;

public class PdfReader extends EBookReader {

    public PdfReader(Book book) {
        super(book);
    }

    @Override
    public String readBook() {
        return "book content is: pdf";
    }

    @Override
    public String displayReaderType() {
        return "Using PDF reader";
    }
}

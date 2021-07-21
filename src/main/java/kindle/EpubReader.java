package kindle;

public class EpubReader extends EBookReader {
    public EpubReader(Book book) {
        super(book);
    }

    @Override
    public String readBook() {
        //write your code here
        return "book content is: epub";
    }

    @Override
    public String displayReaderType() {
        return "Using EPUB reader";
    }
}

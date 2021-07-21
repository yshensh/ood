package kindle;

public class Kindle {
    private final EBookReaderFactory factory;

    public Kindle() {
        //write your code here
        factory = new EBookReaderFactory();
    }

    public String readBook(Book book) throws Exception {
        EBookReader reader = factory.createReader(book);
        return reader.displayReaderType() + ", " + reader.readBook();
    }

    public void downloadBook(Book book) {
    }

    public void uploadBook(Book book) {
    }

    public void deleteBook(Book book) {
    }
}

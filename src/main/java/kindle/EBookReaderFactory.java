package kindle;

public class EBookReaderFactory {
    public EBookReader createReader(Book b) {
        if (b.getFormat() == Format.EPUB) {
            return new EpubReader(b);
        } else if (b.getFormat() == Format.PDF) {
            return new PdfReader(b);
        } else {
            return new MobiReader(b);
        }
    }
}

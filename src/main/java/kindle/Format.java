package kindle;

public enum Format {
    EPUB("epub"), PDF("pdf"), MOBI("mobi");

    private final String content;

    Format(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

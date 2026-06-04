package library;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author) {
        setIsbn(isbn);
        setTitle(title);
        setAuthor(author);
        this.available = true;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be null or blank!");
        }
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank!");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be null or blank");
        }
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return  String.format(
                "ISBN: [%-10s]\nTitle: %-10s\nAuthor: %-10s\nStatus: %s",
                getIsbn(), getTitle(), getAuthor(),
                isAvailable()? "AVAILABLE": "NOT AVAILABLE",
                "───────────────────"
        );
    }
}

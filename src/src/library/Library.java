package library;

public class Library {

    private Book[] books;
    private int count;
    private static final int MAX_SIZE = 100;

    public Library() {
        this.books = new Book[MAX_SIZE];
        this.count = 0;
    }

    public void addBook(Book book) {
            if (count == MAX_SIZE) {
                System.out.println("Library is full");
            } else {
                books[count] = book;
                count++;
            }
    }

    public void listBooks() {
        if (count == 0 ) {
            System.out.println("No books in library");
        } else {
            for (int book = 0; book < count; book++) {
                System.out.println(books[book]);
            }
        }
    }

    public Book searchByTitle(String title) {
        for (int index = 0; index < count; index++) {
            if (books[index].getTitle().equalsIgnoreCase(title)) {
                return books[index];
            }
        }
        return null;
    }
}

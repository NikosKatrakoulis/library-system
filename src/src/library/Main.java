package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Library library = new Library();

            boolean isRunning = true;

            while (isRunning) {
                System.out.println("=== Library Menu ==");
                System.out.println("1. Add Book");
                System.out.println("2. List Books");
                System.out.println("3. Search by Title");
                System.out.println("0. Exit");
                System.out.print("Choose one: ");
                String menuInput = scanner.nextLine().trim().toLowerCase();


                try {
                    int menuChoice = Integer.parseInt(menuInput);

                    switch (menuChoice) {
                        case 1:
                            System.out.print("Enter the isbn: ");
                            String isbn = scanner.nextLine();
                            System.out.print("Enter the title: ");
                            String title = scanner.nextLine();
                            System.out.print("Enter the author: ");
                            String author = scanner.nextLine();
                            System.out.println();
                            Book book = new Book(isbn, title, author);
                            System.out.println("You added the book: " + "\n" + book);
                            library.addBook(book);
                            break;
                        case 2:
                            System.out.println("=== List of Books ===");
                            library.listBooks();
                            break;
                        case 3:
                            System.out.print("Enter the title of the book: ");
                            String bookTitle = scanner.nextLine();
                            Book result = library.searchByTitle(bookTitle);
                            if (result == null) {
                                System.out.println("Book not found.");
                            } else {
                                System.out.println(result);
                            }
                            break;
                        case 0:
                            isRunning = false;
                            break;
                        default:
                            System.out.println("Please enter a number between 0 and 3!");
                            System.out.println();
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number!");
                    System.out.println();
                }
            }
        }
    }
}

package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)){

            Library library = new Library();

            boolean isRunning = true;

            while (isRunning) {
                System.out.println("=== Library Menu ==");
                System.out.println("1. Add Book");
                System.out.println("2. List Books");
                System.out.println("3. Search by Title");
                System.out.println("0. Exit");
                System.out.println("Choose one: ");
                String menuInput = scanner.nextLine().trim().toLowerCase();
                int menuChoice = Integer.parseInt(menuInput);

                switch (menuChoice) {
                    case 1:
                        library.addBook();
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        library.searchByTitle();
                        break;
                    case 0:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Please enter a number between 0 and 3!");
                        System.out.println();
                        break;
                }

            }


        }
    }
}

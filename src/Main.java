import java.util.*;
public class Main {
    public static void main(String[] args) {
         HashMap<Book, Boolean> bookAvailability = new HashMap<>();

        Book book1 = new Book("9780134685991", "Joshua Bloch", "Effective Java");
        Book book2 = new Book("9780596009205", "Kathy Sierra", "Head First Java");
        Book book3 = new Book("9780132350884", "Robert C. Martin", "Clean Code");
        Book book4 = new Book("9780201633610", "Erich Gamma", "Design Patterns");
        Book book5 = new Book("9781492056355", "Brian Goetz", "Java Concurrency in Practice");
        BinaryTree tree = new BinaryTree(book1);

        tree.addNode(book2);
        tree.addNode(book3);
        tree.addNode(book4);
        tree.addNode(book5);
        System.out.println(tree.findNode("9781492056355"));


        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Search a book");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice: ");
            int num = scanner.nextInt();
            int choice = getValidatedChoice(scanner, 1, 4);

            switch(choice){
                case 1:
                    borrowingBook(tree,bookAvailability);
                    break;
                case 2:
                    System.out.println("What book do you want to return");
                    break;
                case 3:
                    System.out.println("Enter your book");
                    break;
                case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
            }

        }

    }

    private static int getValidatedChoice(Scanner scanner, int min, int max) {
        int choice = -1;
        boolean validInput = false;
        while(!validInput) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        return choice;

    }
    private static void borrowingBook(BinaryTree tree, HashMap<Book, Boolean> bookAvailability) {
        Scanner scanner = new Scanner(System.in);
        String bookIsbn;
        Book currentBook;
        System.out.println("Book Borrowed");
        System.out.println("Enter the ISBN of the book you want to borrow");
        while (true) {
            {
                bookIsbn = scanner.nextLine();
                if ((bookIsbn.length() == 10 || bookIsbn.length() == 13)) {
                    break;
                } else {
                    System.out.println("Please enter an ISBN with either 10 or 13 digits ");
                }
            }
            currentBook = tree.findNode(bookIsbn);
            if (currentBook != null) {
                System.out.println(currentBook.toString());
            }
        }
    }
}

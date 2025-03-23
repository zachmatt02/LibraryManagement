import java.util.*;
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("978-0134685991", "Joshua Bloch", "Effective Java");
        Book book2 = new Book("978-0596009205", "Kathy Sierra", "Head First Java");
        Book book3 = new Book("978-0132350884", "Robert C. Martin", "Clean Code");
        Book book4 = new Book("978-0201633610", "Erich Gamma", "Design Patterns");
        Book book5 = new Book("978-1492056355", "Brian Goetz", "Java Concurrency in Practice");
        BinaryTree tree = new BinaryTree(book1);
        tree.addNode(book2);
        tree.addNode(book3);
        tree.addNode(book4);
        tree.addNode(book5);
        System.out.println(tree.findNode("978-1492056355"));


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
                    System.out.println("Book Borrowed");
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
}

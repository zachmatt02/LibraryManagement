import java.util.*;
public class Main {
    public static void main(String[] args) {

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
            }



        }
//        BinaryTree tree = new BinaryTree(20);
//
//
//        tree.addNode(30);
//
//        System.out.println(tree.findNode(30));
//
//
//        tree.addNode(5);
//
//        System.out.println(tree.findNode(5));
//
//        tree.addNode(35);
//        tree.addNode(37);
//        tree.addNode(36);
//
//        System.out.println(tree.findNode(36));

    }

    private static int getValidatedChoice(Scanner scanner, int min, int max) {
        int choice = -1;
        boolean validInput = false;

        while(true) {
            while(true) {
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
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(20);

        tree.addNode(30);

        System.out.println(tree.findNode(30));


        tree.addNode(5);

        System.out.println(tree.findNode(5));

        tree.addNode(35);
        tree.addNode(37);
        tree.addNode(36);

        System.out.println(tree.findNode(36));



    }
}

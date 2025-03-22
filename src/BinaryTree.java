public class BinaryTree {
    Node root;

    public BinaryTree (int a){
        this.root = new Node(a);

    }
    public void addNode(int a){
        Node newNode = new Node(a);
        Node currentNode = root;
        while(true)
        {
            //Add a check if node = to a previous node
            if(currentNode.getData() > a){
                if (currentNode.left == null)
                {
                    currentNode.left = newNode;
                    break;
                }
                else {
                    currentNode = currentNode.left;
                }
            }
            else if(currentNode.getData() < a){
                if (currentNode.right == null)
                {
                    currentNode.right = newNode;
                    break;
                }
                else {
                    currentNode = currentNode.right;
                }
            }


        }
    }
    public Node findNode(int a){
        String counter = "";
        Node currentNode = root;
        while(true)
        {
            if (currentNode.getData() > a)
            {
                if(currentNode.left != null)
                {
                    counter = counter + "left ";
                    currentNode = currentNode.left;
                }
                else{
                    System.out.println("No Node with the value" + a);
                    return null;

                }
            }
            if (currentNode.getData() < a)
            {
                if(currentNode.right != null)
                {
                    counter = counter + "right ";
                    currentNode = currentNode.right;
                }
                else{
                    System.out.println("No Node with the value" + a);
                    return null;
                }
            }
            if (currentNode.getData() == a)
            {
                System.out.println(counter);

                return currentNode;
            }
        }

    }
    public void deleteNode(int a)
    {
        Node currentNode = findNode(a);
        if(currentNode.left == null && currentNode.right == null)
        {
            currentNode = null;
        }
        else if(currentNode.left != null && currentNode.right == null)
        {
            currentNode = currentNode.left;
        }
        else if(currentNode.left == null && currentNode.right != null)
        {
            currentNode = currentNode.right;
        }
        else
        {
            Node finalNode = currentNode.right;
            while(true)
            {
                if(finalNode.left == null)
                {
                    currentNode = null;
                    currentNode = finalNode;
                    break;
                }
                else
                {
                    finalNode = finalNode.left;
                }
            }
        }


    }
}

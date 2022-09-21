import java.util.Scanner;

public class BinaryTree {
    static Scanner s = null;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter the data: ");
        int data = s.nextInt();

        if(data == -1) return null;

        // new keyword is used as we are creating object of node class
        root = new Node(data);

        // for creating the left sub tree recursively
        System.out.println("Enter left for root " + data);
        root.left = createTree();

        // for creating the right sub-tree recursively
        System.out.println("Enter right for root " + data);
        root.right = createTree();
        return root;
    }

    static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

class Node{
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

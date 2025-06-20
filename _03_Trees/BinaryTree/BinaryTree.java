package _03_Trees.BinaryTree;

public class BinaryTree {
    static class Node {
        int data;
        Node left, right;


        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void postorder(Node node) {
        if(node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(7);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(44);

        tree.preorder(tree.root);
        System.out.println();
        System.out.println("-----------------");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("-----------------");
        tree.postorder(tree.root);
        System.out.println();
        System.out.println("-----------------");


    }


}

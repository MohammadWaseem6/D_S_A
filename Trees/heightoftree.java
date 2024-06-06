package Trees;

public class heightoftree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int Height(Node root) {// height of tree
        if (root == null) {
            return 0;
        }
        int lf = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lf, rh) + 1;
    }

    public static int count(Node root) { // count of nodes
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    public static int sum(Node root) {// sum of nodes
        if (root == null) {
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }

    public static void main(String[] args) {
        heightoftree tree = new heightoftree();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        System.out.println("Height of tree is : " + tree.Height(root));
        System.out.println("Count of nodes is :" + count(root));
        System.out.println("sum of nodes data is :" + sum(root));
    }
}

/**
 * BinaryTree Implementation
 * 
 * This class provides functionality to work with binary trees, including construction from an array and various traversal methods.
 */
package Trees;

import java.util.*;

public class BinaryTree {
    /**
     * Represents a node in the binary tree.
     */
    static class Node {
        int data; // The data stored in the node
        Node left; // Reference to the left child node
        Node right; // Reference to the right child node

        /**
         * Constructs a new node with the given data.
         *
         * @param data The data to be stored in the node.
         */
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1; // Index variable to keep track of the current position in the array

    /**
     * Function to build a binary tree from an array using pre-order traversal.
     *
     * @param nodes The input array representing the binary tree.
     * @return The root node of the constructed binary tree.
     */
    public static Node buildTree(int nodes[]) {
        index++; // Increment the index to move to the next element in the array
        if (index >= nodes.length || nodes[index] == -1) {
            return null; // If the current element is -1 or the index is out of bounds, return null to
                         // create an empty node
        }
        Node newNode = new Node(nodes[index]); // Create a new node with the current element as data
        newNode.left = buildTree(nodes); // Recursively build the left subtree
        newNode.right = buildTree(nodes); // Recursively build the right subtree
        return newNode; // Return the current node
    }

    /**
     * Perform pre-order traversal of the binary tree and print the elements.
     *
     * @param root The root node of the binary tree.
     */
    public static void PreOrderTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrderTree(root.left);
        PreOrderTree(root.right);
    }

    /**
     * Perform in-order traversal of the binary tree and print the elements.
     *
     * @param root The root node of the binary tree.
     */
    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    /**
     * Perform post-order traversal of the binary tree and print the elements.
     *
     * @param root The root node of the binary tree.
     */
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    /**
     * Perform level-order traversal of the binary tree and print the elements.
     *
     * @param root The root node of the binary tree.
     */
    public static void Levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            System.out.print(currNode.data + " ");

            if (currNode.left != null) {
                q.add(currNode.left);
            }
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = buildTree(nodes); // Build the binary tree from the array

        System.out.println("Pre-Order Traversal:");
        PreOrderTree(root);
        System.out.println();

        System.out.println("In-Order Traversal:");
        InOrder(root);
        System.out.println();
        System.out.println("Post-Order Traversal:");
        postorder(root);
        System.out.println();
        System.out.println("Level-Order Traversal:");
        Levelorder(root);
    }
}

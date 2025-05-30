/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wow.tree;

/**
 *
 * @author Student's Account
 */
public class BinaryTree {

    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {// if root is empty
            return new Node(value);// return a new instantiated node   
        }
        if (value < root.value) {//if value is less than whats in the root
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);

        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void preorder() {
        preoderRec(root);
    }

    public void postorder() {
        postorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value + "");
            inorderRec(root.right);
        }
    }

    private void preoderRec(Node root) {
        if (root != null) {
            System.out.println(root.value + "");
            preoderRec(root.left);
            preoderRec(root.right);
        }
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.value + "");
        }
    }
}

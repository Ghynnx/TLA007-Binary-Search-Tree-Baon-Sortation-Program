/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package wow.tree;

/**
 *
 * @author Student's Account
 */
import java.util.Scanner;
import java.util.LinkedList;

public class Tree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> allowance = new LinkedList<>();

        while (true) {

            System.out.println(" ");
            System.out.println(">>>> Main Menu <<<<");
            System.out.println("1. Display Allowance");
            System.out.println("2. input Allawance of a student");
            System.out.println("3. Exit");
            System.out.println(" ");
            System.out.print("Please chooce from options above: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.println(">>>>> List of All Allowance <<<<<");
                    HighToLow(tree.root, allowance);
                    if (allowance.isEmpty()) {
                        System.out.println(" ");
                        System.out.println("No Allowance added yet.");
                        System.out.println("-------<>-------");
                        continue;
                    } else {
                        for (int value : allowance) {
                            System.out.println(value);
                        }
                    }
                    return;
                case 2:
                    System.out.print("Please Input Your Allowance: ");
                    int kwarta = scan.nextInt();
                    tree.insert(kwarta);
                case 3:
                    break;
                default:
                    System.out.println("Error: Invalid Input");
            }
        }
    }

    private static void HighToLow(Node root, LinkedList<Integer> allowance) {
        if (root != null) {
            HighToLow(root.right, allowance);
            allowance.add(root.value);
            HighToLow(root.left, allowance);
        }
    }
}

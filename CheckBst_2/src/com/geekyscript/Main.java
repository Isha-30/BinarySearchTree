package com.geekyscript;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        inorder(root);
        System.out.println();
        if (isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

    private static void inorder(Node node){
        if(node!= null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    static int prev = Integer.MIN_VALUE;
    static boolean isBST(Node root){
        if(root ==  null) return true;
        if(!isBST(root.left)) return false;
        if(root.data <= prev) return false;
        prev = root.data;
        return isBST(root.right);
    }
}

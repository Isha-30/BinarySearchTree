package com.geekyscript;

public class Main {

    public static void main(String[] args) {
        int arr[] = {50, 20, 10, 40, 70, 100, 120, 60, 80};
        Node root = new Node(arr[0]);
        for(int i = 1; i<arr.length; i++){
            insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

    static boolean isBST(Node root, int min, int max){
        if(root == null) return true;

        return(root.data>min && root.data<max && isBST(root.left, min, root.data) && isBST(root.right, root.data, max));
    }
    private static Node insert(Node node, int x){
        if(node == null) return new Node(x);
        else if(node.data < x){
            node.right = insert(node.right, x);
        }
        else if(node.data > x){
            node.left = insert(node.left, x);
        }
        return node;
    }

    private static void inorder(Node node){
        if(node!= null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

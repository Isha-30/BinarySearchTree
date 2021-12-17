package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = {50, 20, 10, 40, 70, 100, 120, 60, 80};
        Node root = new Node(arr[0]);
        for(int i = 1; i<arr.length; i++){
            insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(printKth(root, 3).data);;
    }

    public static Node insert(Node node, int x){
        if(node == null) return new Node(x);
        else if(node.data < x){
            node.right = insert(node.right, x);
        }
        else if(node.data > x){
            node.left = insert(node.left, x);
            node.lcount++;
        }
        return node;
    }
    public static Node printKth(Node root, int k){
        if(root == null) return null;
        int count = root.lcount + 1;
        if(count==k)
            return root;
        if(count>k)
            return printKth(root.left, k);

        return printKth(root.right, k-count);


    }

    private static void inorder(Node node){
        if(node!= null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
//    static int count = 0;
//    public static void printKth(Node root, int k){
//        if(root!=null){
//            printKth(root.left, k);
//            count++;
//            if(count==k) {
//                System.out.print(root.data);
//                return;
//            }
//            printKth(root.right, k);
//        }
//    }


}

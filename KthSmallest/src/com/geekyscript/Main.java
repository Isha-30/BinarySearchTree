package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        Node root = new Node(50);
        for(int i = 0; i<n; i++){
            int ele = sc.nextInt();
            insert(root, ele);
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

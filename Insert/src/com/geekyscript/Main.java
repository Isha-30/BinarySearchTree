package com.geekyscript;

public class Main {

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=20;

        //root=insertRecursive(root,x);
        root = insertIterative(root, x);
        inorder(root);

    }

    public static Node insertRecursive(Node node, int x){
        if(node == null) return new Node(x);
        else if(node.data < x) node.right = insertRecursive(node.right, x);
        else if(node.data > x) node.left = insertRecursive(node.left, x);
        return node;
    }

    public static Node insertIterative(Node root, int x){
        Node temp = new Node(x);
        Node parent = null, curr = root;
        while(curr!=null){
            parent = curr;
            if(curr.data > x)
                curr = curr.left;
            else if(curr.data<x)
                curr = curr.right;
            else
                return root;
        }

        if(parent==null)
            return temp;
        if(parent.data>x)
            parent.left = temp;
        else
            parent.right = temp;
        return root;
    }
    
    private static void inorder(Node node){
        if(node!= null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

package com.geekyscript;

public class Main {

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=9;
        Node ans = floor(root, x);
        System.out.println(ans.key);
    }

    public static Node floor(Node root, int x){
        Node res = null;
        while(root!=null){
            if(root.key == x) return root;
            else if(root.key > x) root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
    private static void inorder(Node node){
        if(node!= null){
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
}

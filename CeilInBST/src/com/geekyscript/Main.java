package com.geekyscript;

public class Main {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=19;
        Node ans = ceil(root, x);
        if(ans==null) System.out.println("Ceil value does not exist");
        else System.out.println(ans.key);
    }
    public static Node ceil(Node root, int x){
        Node res = null;
        while(root!=null){
            if(root.key == x) return root;
            else if(root.key < x) root = root.right;
            else {
                res = root;
                root = root.left;
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

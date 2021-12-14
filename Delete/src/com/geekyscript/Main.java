package com.geekyscript;

public class Main {

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=15;
        root = delNode(root, x);
        inorder(root);

    }

    public static Node delNode(Node root, int x){
        if(root==null) return root;
        if(x>root.key)
            root.right = delNode(root.right, x);
        else if(x<root.key)
            root.left = delNode(root.left, x);
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
        }
        return root;
    }

    private static Node getSucc(Node root){
        Node curr = root.right;
        while (curr!=null && curr.left!=null)
            curr = curr.left;
        return curr;
    }
    private static void inorder(Node node){
        if(node!= null){
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
}

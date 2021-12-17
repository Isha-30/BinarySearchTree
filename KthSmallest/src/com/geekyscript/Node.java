package com.geekyscript;

public class Node {
    int data;
    Node left, right;
    int lcount;
    Node(int data){
        this.data = data;
        left = right  = null;
        lcount = 0;
    }
}

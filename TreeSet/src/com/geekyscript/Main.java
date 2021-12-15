package com.geekyscript;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){
        TreeSet<String> s = new TreeSet<>();
        s.add("mango");
        s.add("apple");
        s.add("orange");
        System.out.println(s);

        System.out.println(s.contains("orange"));

        Iterator<String> i = s.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}

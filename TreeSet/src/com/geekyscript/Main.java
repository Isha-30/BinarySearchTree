package com.geekyscript;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){
        TreeSet<String> s = new TreeSet<>();
        s.add("mango");
        s.add("apple");
        s.add("orange");
        System.out.println("--------Print, contains, iterator--------");
        System.out.println(s);

        System.out.println(s.contains("orange"));

        Iterator<String> i = s.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("--------remove, for loop--------");

        TreeSet<Integer> s1 = new TreeSet<>();
        s1.add(15);
        s1.add(10);
        s1.add(2);
        s1.add(5);
        s1.add(18);

        s1.remove(10);
        for(Integer x : s1)
            System.out.print(x + " ");
    }
}

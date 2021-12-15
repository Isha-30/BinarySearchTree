package com.geekyscript;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(10, "apple");
        t.put(5, "orange");
        t.put(15, "mango");
        System.out.println(t);
        System.out.println("Contains 10? " + t.containsKey(10));
        System.out.println("Contains Orange? " + t.containsValue("orange"));

        for(Map.Entry<Integer, String> e : t.entrySet())
            System.out.println(e.getKey()+ " " + e.getValue());

        System.out.println(t.higherKey(4));
        System.out.println(t.lowerKey(7));
        System.out.println((t.floorKey(10)));
        System.out.println(t.ceilingKey(16));

        System.out.println(t.higherEntry(10).getValue());
        System.out.println(t.lowerEntry(10).getValue());
        System.out.println(t.floorEntry(10).getValue());
        System.out.println(t.ceilingEntry(10).getValue());
    }
}

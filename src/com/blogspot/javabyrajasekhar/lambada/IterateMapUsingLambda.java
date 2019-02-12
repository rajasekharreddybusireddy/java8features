package com.blogspot.javabyrajasekhar.lambada;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Lambda Expression – Iterating Map and List in Java 8
public class IterateMapUsingLambda {
    public static void main(String[] args) {
        HashMap<String, Integer> myhashMap = new HashMap<>();
        myhashMap.put("rajasekhar",24);
        myhashMap.put("srinu",18);
        myhashMap.put("vasu",42);
        myhashMap.put("anil",29);
        myhashMap.put("sai",13);

        //by using itertor
        System.out.println("by using iterator-------------");
        Set<Map.Entry<String, Integer>> keys = myhashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

    }
        //old way
        System.out.println("by using keyset and foreach-------------------");
        Set<String> keySet = myhashMap.keySet();
        for (String name:keySet
             ) {
            System.out.println("person   :"+name+"   "+"age :-"+myhashMap.get(name));
        }
        System.out.println("buy using lambada expressions------------------");
        myhashMap.forEach((K,V)-> System.out.println("person :"+K +"  age  :"+V));
    }
}

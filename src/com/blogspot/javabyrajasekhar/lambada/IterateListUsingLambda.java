package com.blogspot.javabyrajasekhar.lambada;

import java.util.ArrayList;

//Iterating List in Java 8 using Lambda expression
public class IterateListUsingLambda {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("rajasekhar");
        namesList.add("sekhar");
        namesList.add("anil");
        namesList.add("ramu");

        System.out.println("iterating by using foreach---------------");
        for (String name:namesList
             ) {
            System.out.println(name);
        }

        System.out.println("by using java 8 lambada foreach-----------------");
        namesList.forEach(System.out::println);
    }
}

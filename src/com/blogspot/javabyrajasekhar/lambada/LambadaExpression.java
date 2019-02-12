package com.blogspot.javabyrajasekhar.lambada;

import java.util.ArrayList;
import java.util.List;

public class LambadaExpression {
    public static void main(String[] args) {
        lambadam1();
        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
    list.stream().forEach(System.out::println);
    list.forEach((e)-> System.out.println(e));
    }

    public static void lambadam1() {
        //old way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("old way");
            }
        }).start();

//new way
        new Thread(()-> System.out.println("new way")).start();
    }
}

package com.blogspot.javabyrajasekhar.methodrefernces;

//@FunctionalInterface
interface MyFunctionalInterface {

    public static void main(String[] args) {

        System.out.println("hi"+ addMethod(10,20));
    }
    public static int addMethod(int a, int b){
        return a+b;
    }
}

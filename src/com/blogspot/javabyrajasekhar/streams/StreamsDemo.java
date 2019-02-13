package com.blogspot.javabyrajasekhar.streams;

import com.blogspot.javabyrajasekhar.model.Employee;

import java.util.ArrayList;

//Iterating List in Java 8 using Lambda expression
public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        for (int i=1;i<=10;i++){
            employeeList.add(new Employee(i,"raja"+i,1000*Math.random()+9999));
        }

        System.out.println("time seq :-"+System.currentTimeMillis());
        System.out.println("by using java 8 lambada foreach-----------------");
        long count = employeeList.stream().filter(employee -> employee.getEmpSalary() > 10500).count();
        System.out.println(count);
        employeeList.forEach(System.out::println);
        System.out.println("time parallel :-"+System.currentTimeMillis());
        System.out.println(employeeList.parallelStream().filter(employee -> employee.getEmpSalary() > 10500).count());
    }
}

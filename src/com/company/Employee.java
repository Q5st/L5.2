package com.company;

public class Employee {
    private String name;
    private int depar;
    private int sal;
    public static int j;

    public Employee(String name, int sal, int depar) {
        this.name = name;
        this.sal = sal;
        this.depar = depar;
        j++;
    }

}

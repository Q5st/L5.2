package com.company;

public class Employee {
    private String name;
    private int depar;
    private int sal;
    public static int j;
    public static int dp1;
    public static int dp2;

    public Employee(String name, int sal, int depar) {
        this.name = name;
        this.sal = sal;
        this.depar = depar;
        j++;
        if (this.depar == 1) {
            dp1++;
        } else {
            dp2++;
        }
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return this.sal;
    }

    public void setSal(int sal) { this.sal = sal; }

    public int getDepar() {
        return this.depar;
    }

    public void setDepar(int depar) { this.depar = depar; }

}

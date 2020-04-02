package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Employee emp1 = new Employee("sdfsd", 8, 1);
        Employee emp2 = new Employee("iasf", 4, 2);
        Employee emp3 = new Employee("kdsfdf", 6, 1);
        Employee emp4 = new Employee("ddfsd" , 4, 1);
        Employee emp5 = new Employee("rdfsd", 9, 2);

        String depar1Arr[] = new String[Employee.dp1];
        String depar2Arr[] = new String[Employee.dp2];
        int salArr[] = new  int[Employee.j];

        if (emp1.getDepar()==1){ depar1Arr[1] = emp1.getName();} else {depar2Arr[1] = emp1.getName();}
        salArr[1] = emp1.getSal();
        if (emp2.getDepar()==1){ depar1Arr[2] = emp2.getName();} else {depar2Arr[2] = emp2.getName();}
        salArr[2] = emp1.getSal();
        if (emp1.getDepar()==1){ depar1Arr[5] = emp5.getName();} else {depar2Arr[5] = emp5.getName();}
        salArr[5] = emp1.getSal();
        if (emp1.getDepar()==1){ depar1Arr[4] = emp4.getName();} else {depar2Arr[4] = emp4.getName();}
        salArr[4] = emp1.getSal();
        if (emp1.getDepar()==1){ depar1Arr[3] = emp3.getName();} else {depar2Arr[3] = emp3.getName();}
        salArr[3] = emp1.getSal();

        Scanner scanner = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter department");
            a=scanner.nextInt();
        }while (a!=1 || a!=2);
        if (a==1){System.out.println(Arrays.toString(depar1Arr));}
        else{System.out.println(Arrays.toString(depar2Arr));}
    }
}

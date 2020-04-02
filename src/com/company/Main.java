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

        int dpI1=0, dpI2=0;

        if (emp1.getDepar()==1){ depar1Arr[dpI1] = emp1.getName(); dpI1++;} else {depar2Arr[dpI2] = emp1.getName(); dpI2++;}
        salArr[0] = emp1.getSal();
        if (emp2.getDepar()==1){ depar1Arr[dpI1] = emp2.getName(); dpI1++;} else {depar2Arr[dpI2] = emp2.getName(); dpI2++;}
        salArr[1] = emp2.getSal();
        if (emp5.getDepar()==1){ depar1Arr[dpI1] = emp5.getName(); dpI1++;} else {depar2Arr[dpI2] = emp5.getName(); dpI2++;}
        salArr[4] = emp5.getSal();
        if (emp4.getDepar()==1){ depar1Arr[dpI1] = emp4.getName(); dpI1++;} else {depar2Arr[dpI2] = emp4.getName(); dpI2++;}
        salArr[3] = emp4.getSal();
        if (emp3.getDepar()==1){ depar1Arr[dpI1] = emp3.getName(); dpI1++;} else {depar2Arr[dpI2] = emp3.getName(); dpI2++;}
        salArr[2] = emp3.getSal();

        Scanner scanner = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter department");
            a=scanner.nextInt();
        }while (a!=1 && a!=2);
        if (a==1){System.out.println(Arrays.toString(depar1Arr));}
        else{System.out.println(Arrays.toString(depar2Arr));}

        int tmp;

        for (int i = 0; i < salArr.length; i++) {
            for (int j = i + 1; j < salArr.length; j++) {
                if (salArr[i] < salArr[j]) {
                    tmp = salArr[i];
                    salArr[i] = salArr[j];
                    salArr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(salArr));
    }
}

package com.practice.assignmentone;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte age;
        String name,departmentName,gender;
        double salary;

        System.out.print("Enter age: ");
        age = sc.nextByte();

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter department name: ");
        departmentName = sc.next();

        System.out.print("Enter gender: ");
        gender = sc.next();

<<<<<<< HEAD
        Employeee e1 = new Employeee(age,name,salary,departmentName,gender);
=======
        Employee e1 = new Employee(age,name,salary,departmentName,gender);
>>>>>>> ebe4a69da3551113ce7bcb97ae4db0395447a776
        System.out.println(e1);
    }
}

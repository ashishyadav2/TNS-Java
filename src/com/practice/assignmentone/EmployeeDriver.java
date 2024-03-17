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

        Employee e1 = new Employee(age,name,salary,departmentName,gender);
        System.out.println(e1);
    }
}

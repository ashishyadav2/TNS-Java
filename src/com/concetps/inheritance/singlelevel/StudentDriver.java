package com.concetps.inheritance.singlelevel;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age,rollNum;
        String name,nationality,gender;

        System.out.print("Enter nationality: ");
        nationality = sc.next();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter gender: ");
        gender = sc.next();

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter roll number: ");
        rollNum = sc.nextInt();

        Student student1 = new Student(nationality,age,gender,name,rollNum);
        System.out.println(student1);
    }
}

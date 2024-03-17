package com.practice.inheritance.singlelevel;

public class Student extends Citizen {
    private int rollNum;
    public Student(String nationality, int age, String gender, String name,int rollNum) {
        super(nationality,age,gender,name);
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nationality='" + this.getNationality() + '\'' +
                ", age=" + this.getAge() +
                ", gender='" + this.getGender() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", rollNum='" +this.rollNum + '\'' +
                '}';
    }
}

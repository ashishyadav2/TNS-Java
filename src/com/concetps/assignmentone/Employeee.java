package com.concetps.assignmentone;

public class Employeee {
    private byte age;
    private String name;
    private double salary;
    private String departmentName;
    private String gender;



    public Employeee() {
        this.age = 0;
        this.name = "";
        this.salary = 0;
        this.departmentName = "";
        this.gender = "";
    }
    public Employeee(byte age, String name, double salary, String departmentName, String gender) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
        this.gender = gender;
    }
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", departmentName='" + departmentName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

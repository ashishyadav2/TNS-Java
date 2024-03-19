package com.concetps.inheritance.singlelevel;

public class Citizen {
    private String nationality;
    private int age;
    private String gender;
    private String name;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Citizen() {
        super();
        this.nationality = "";
        this.age = 0;
        this.gender = "";
        this.name = "";
    }
    public Citizen(String nationality, int age, String gender, String name) {
        super();
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "nationality='" + nationality + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.concetps.association;

public class AssociationDriver {

    public static void main(String[] args) {
        Department dept = new Department("IT",89);
        Company company = new Company("Media.net","Mumbai");
        Employee employee1 = new Employee(125,900000,dept,company);
        Employee employee2 = new Employee(198,50000,dept,company);
        System.out.println(employee1);
        System.out.println(employee2);

    }


}

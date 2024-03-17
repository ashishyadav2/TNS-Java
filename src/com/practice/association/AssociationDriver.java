package com.practice.association;

public class AssociationDriver {
    Department dept = new Department("IT",89);
    Company company = new Company("Media.net","Mumbai");
    Employee employee1 = new Employee(125,900000,dept,company);
    System.out.println(company);

}

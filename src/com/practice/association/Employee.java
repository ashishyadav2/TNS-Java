package com.practice.association;

public class Employee {
    private int id;
    private int salary;
    private Department department;
    private Company company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, int salary, Department department, Company company) {
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.company = company;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", department=" + department.getDeptName() +
                ", departmentId=" + department.getId() +
                ", companyName=" + company.getName() +
                ", companyLocation=" + company.getLocation() +
                '}';
    }
}

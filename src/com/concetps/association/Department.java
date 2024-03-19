package com.concetps.association;

public class Department {
    private String deptName;
    private int id;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department(String deptName, int id) {
        this.deptName = deptName;
        this.id = id;
    }
}

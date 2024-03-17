package com.practice.association;

public class Company {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }
}

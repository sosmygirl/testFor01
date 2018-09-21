package com.fs.example;

public class Employee extends Person{
    int id;
    double wage;
    float workAge;
    public Employee(){

    }
    public Employee(int id, double wage, float workAge) {
        this.id = id;
        this.wage = wage;
        this.workAge = workAge;
    }

    public Employee(String name, String address, int id, double wage, float workAge) {
        super(name, address);
        this.id = id;
        this.wage = wage;
        this.workAge = workAge;
    }
}

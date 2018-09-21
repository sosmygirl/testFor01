package com.fs.example;

public class Manager extends Employee {
    char level;
    public Manager(){

    }

    public Manager(char level) {
        this.level = level;
    }

    public Manager(int id, double wage, float workAge, char level) {
        super(id, wage, workAge);
        this.level = level;
    }

    public Manager(String name, String address, int id, double wage, float workAge, char level) {
        super(name, address, id, wage, workAge);
        this.level = level;
    }
}

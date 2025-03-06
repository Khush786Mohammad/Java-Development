package com.mypackage;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.id +" "+this.name;
    }
}

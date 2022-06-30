package com.example.demo;

public class Person {
    private long id;
    private String name;
    private Integer salary;

    public Person (Integer id, String name, Integer salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }
}

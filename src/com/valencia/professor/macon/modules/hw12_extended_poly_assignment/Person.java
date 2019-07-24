package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class Person {
    private String name;
    private int age;

//CONSTRUCTOR:
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }


//SETTERS:
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

//GETTERS:
    public String getName() { return name; }
    public int getAge() { return age; }


//toString():
    public String toString() {
        return "Name: "+name+
                "\nAge: "+age;
    }
}

package com.valencia.professor.macon.modules.hw6_composite_class_UML;


public class Person {

 //  VARIABLES:
    private String gender;
    private int age;
    private double salary;


//  GETTERS:
    public void setGender(String gender) { this.gender = gender; }
    public void setAge(int age) { this.age = age; }
    public void setSalary(int salary) { this.salary = salary; }

//  SETTERS:
    public String getGender() { return gender; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
} //end of Person

//TODO:
// A class that defines a Person (name, gender, age, and salary).     (You can add other classes if you want.)
// Then, define all setters and getters, constructors and toString methods.
// Then, create and attach a UML for the Person and Name classes.
// ..
// Rules:
// Gender must have three possible values: M, F or O (other).
// Age must be between 1 and 120.
// Salary must be a positive number.
// The first and last name must be in sentence case. (Billy Armstrong)
// A middle name is optional (the code will account for this)

package com.valencia.professor.macon.modules.hw6_composite_class_UML;

import java.util.Scanner;

public class Person {

    Scanner scanner = new Scanner(System.in);

//  VARIABLES:
    private char gender;
    private String name;
    private int age;
    private double salary;

//  GETTERS:
    public void setGender(char gender) { this.gender = gender; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSalary(int salary) { this.salary = salary; }

//  SETTERS:
    public char getGender() { return gender; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

//    int grabAge() {
//        age = scanner.nextInt();
//
//        System.out.println(age);
//
//        return age;
//    }
//
    public void grabSalary() {

        System.out.println("Enter Salary: ");
        salary = scanner.nextDouble();

//      boolean salaryScope = false;

        if (salary>=0) {
            System.out.println("Salary: "+salary);
        } else {
            System.out.println("ERROR! "+salary+" out of scope.");
        }
//        return salary;
    }

    public void grabGender() {
        System.out.println("Enter Gender(M, F, O): ");
        gender = scanner.next().charAt(0);
//      scanner.nextLine();

//        System.out.println(gender);

//        switch (gender) {
//            case a:
//
//        }
    }

} //end of Person

//TODO:
//        A class that defines a Person (name, gender, age, and salary).     (You can add other classes if you want.)
//        Then, define all setters and getters, constructors and toString methods.
//        Then, create and attach a UML for the Person and Name classes.
// Rules:
// Gender must have three possible values: M, F or O (other).
// Age must be between 1 and 120.
// Salary must be a positive number.
// The first and last name must be in sentence case. (Billy Armstrong)
// A middle name is optional (the code will account for this)

package com.valencia.professor.macon.modules.hw6_composite_class_UML;

import java.util.Scanner;

public class HwSix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//      System.out.println("YHVH is one true God");

//  VARIABLES:
        String userName;
        int userAge;
        int userSalary;

//  CONSTRUCTOR:
        Person person = new Person();

//  USR NAME:
        System.out.println("Enter Name: ");
        person.setName(userName=scanner.nextLine());
        System.out.println(userName);

//  USR AGE:
        System.out.println("Enter Age:");
        person.setAge(userAge=scanner.nextInt());
        System.out.println(userAge);

        person.grabSalary();
        person.grabGender();


    } //end of main
} //end of HwSix

//TODO:
// Program Specifications:
// Create a program that has at least three classes.
// ..
//        The class with main.
//        A class that defines a Name (first name, middle name, and last name).
//        A class that defines a Person (name, gender, age, and salary).     (You can add other classes if you want.)
//        Then, define all setters and getters, constructors and toString methods.
//        Then, create and attach a UML for the Person and Name classes.
//        You do not need to create or attach a design tool for this assignment (other than the UMLs).
// ..
//        Specifications for the main:
//        The program will create and populate at least three different people.
//        The program will allow a user to change the fields for a person.
//        The program will output the data for all three people.
// ..
// Rules:
// Gender must have three possible values: M, F or O (other).
// Age must be between 1 and 120.
// Salary must be a positive number.
// The first and last name must be in sentence case. (Billy Armstrong)
// A middle name is optional (the code will account for this)
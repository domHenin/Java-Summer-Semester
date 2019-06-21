///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            HW 6: Composite Class and UML
// Semester:         (cop2800c) Summer 2019
//
// Author:           Dominic Heningburg
// Date:             6/21/2019
//
//////////////////// ``````````````````````````````````` ////////////////////

package com.valencia.professor.macon.modules.hw6_composite_class_UML;

import java.util.Scanner;

public class HwSix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//      System.out.println("YHVH is one true God");

//  VARIABLES:
        String userName;

//  CONSTRUCTOR: Person
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();

//  CONSTRUCTOR: Name
        Name name = new Name();
        Name name1 = new Name();
        Name name2 = new Name();


        name.grabName();
        name1.grabName();
        name2.grabName();

        person.grabGender();
        person1.grabGender();
        person2.grabGender();

        person.grabAge();
        person1.grabAge();
        person2.grabAge();


        person.grabSalary();
        person1.grabSalary();
        person2.grabSalary();

//  Calling Methods
        System.out.println(name.getName().toUpperCase()+"'s Info: ");
        Info(person);

//  NEW SPACE
        System.out.println();
        System.out.println();

//  Calling Methods
        System.out.println(name1.getName().toUpperCase()+"'s Info: ");
        Info(person1);

//  NEW SPACE
        System.out.println();
        System.out.println();

        System.out.println(name2.getName().toUpperCase()+"'s Info: ");
        Info(person2);
    } //end of main

    private static void Info(Person person1) {
        System.out.print("GENDER: "+person1.getGender().toUpperCase()+" ");
        System.out.print("AGE: "+person1.getAge()+" ");
        System.out.print("SALARY: $"+person1.getSalary());
    } //end of Info
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
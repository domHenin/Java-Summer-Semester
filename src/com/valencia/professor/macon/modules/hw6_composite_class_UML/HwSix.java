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

        System.out.println("Do you have a middle name?");
        System.out.println("[y]es OR [n]o");

        String choice=scanner.nextLine();

        switch (choice) {
            case "y":
            //First Name.
                System.out.println("Person 1 Enter First Name: ");
                name.setFirName(scanner.nextLine());

                System.out.println("Person 2 Enter First Name: ");
                name1.setFirName(scanner.nextLine());

                System.out.println("Person 3 Enter First Name: ");
                name2.setFirName(scanner.nextLine());

            //Middle Name.
                System.out.println(name.getFirName()+"'s Middle Name: ");
                name.setMiddName(scanner.nextLine());

                System.out.println(name1.getFirName()+"'s Middle Name: ");
                name1.setMiddName(scanner.nextLine());

                System.out.println(name2.getFirName()+"'s Middle Name: ");
                name2.setMiddName(scanner.nextLine());

            //Last Name.
                System.out.println(name.getFirName()+"'s Last Name: ");
                name.setLasName(scanner.nextLine());

                System.out.println(name1.getFirName()+"'s Last Name: ");
                name1.setLasName(scanner.nextLine());

                System.out.println(name2.getFirName()+"'s Last Name: ");
                name2.setLasName(scanner.nextLine());

             //Full Name.
                System.out.println("Person 1: Full Name: "+name.getFirName()+" "+name.getMiddName()+" "+name.getLasName());
                System.out.println("Person 2: Full Name: "+name1.getFirName()+" "+name1.getMiddName()+" "+name1.getLasName());
                System.out.println("Person 3: Full Name: "+name2.getFirName()+" "+name2.getMiddName()+" "+name2.getLasName());
                break;

            case "n":
            //First Name:
                System.out.println("Person 1 Enter First Name: ");
                name.setFirName(scanner.nextLine());

                System.out.println("Person 2 Enter First Name: ");
                name1.setFirName(scanner.nextLine());

                System.out.println("Person 3 Enter First Name: ");
                name2.setFirName(scanner.nextLine());

             //Last Name:
                System.out.println(name.getFirName()+"'s Last Name: ");
                name.setLasName(scanner.nextLine());

                System.out.println(name1.getFirName()+"'s Last Name: ");
                name1.setLasName(scanner.nextLine());

                System.out.println(name2.getFirName()+"'s Last Name: ");
                name2.setLasName(scanner.nextLine());

                System.out.println();

            //Full Name:
                System.out.println("Person 1: Full Name: "+name.getFirName()+" "+name.getLasName());
                System.out.println("Person 2: Full Name: "+name1.getFirName()+" "+name1.getLasName());
                System.out.println("Person 3: Full Name: "+name2.getFirName()+" "+name2.getLasName());
                break;

            default:
                break;
        }

        System.out.println();

//  GET DATA:
        System.out.println(name.getFirName()+"'s Info: ");
        getInfo(person);

        System.out.println(name1.getFirName()+"'s Info: ");
        getInfo(person1);

        System.out.println(name2.getFirName()+"'s Info: ");
        getInfo(person2);

//  PRINT DATA.
        //Person One.
        System.out.println(name.getFirName().toUpperCase()+"'s Info: ");
        Info(person);
        System.out.println();

        //Person Two.
        System.out.println(name1.getFirName().toUpperCase()+"'s Info: ");
        Info(person1);
        System.out.println();

        //Person Three.
        System.out.println(name2.getFirName().toUpperCase()+"'s Info: ");
        Info(person2);
        System.out.println();



    }//end of main

    private static void Info(Person person) {
        System.out.print("GENDER: "+person.getGender().toUpperCase()+" ");
        System.out.print("AGE: "+person.getAge()+" ");
        System.out.print("SALARY: $"+person.getSalary());
        System.out.println();
    } //end of Info

    private static void getInfo(Person person) {
        System.out.println("Enter Gender? [M]ale [F]emale");
        person.setGender(scanner.nextLine());

        System.out.println("Enter Age: ");
        person.setAge(scanner.nextInt());

        if (person.getAge() >=1 && person.getAge()<= 120) {

        }

        scanner.nextLine();
        //TODO: work on logic for certain age input

        System.out.println("Enter Salary: ");
        person.setSalary(scanner.nextInt());
        scanner.nextLine();
    } //end of getInfo
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
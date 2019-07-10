package com.valencia.professor.macon.modules.hw9_abstract_class_assignment;

import com.valencia.professor.macon.modules.hw7_inheritance_oop.Animal;

public class HwNine {
    public static void main(String[] args) {
//        System.out.println("thank you GOD for being my foundation.");

//      Machine machine = new Machine(001);

        Machine robot = new Robot(002, "How may I assist you?", "Arlo", 50);

        Machine computer = new Computer(003, 32, 1, "hewlett packard", "Software Development");


//      System.out.println(machine);
        System.out.println();
        System.out.println(robot+"\n");
        System.out.println(computer);

//      foo(machine);
        System.out.println();
        System.out.println("Robot-");
        foo(robot);

        System.out.println("Computer-");
        foo(computer);
    }

    public static void foo(Machine machine) {
        System.out.println("Machine Objectives: ");
        machine.objective();
        System.out.println();
    }
}

//TODO:
// thought:: build a robot. -> machine -> robot
// Outcomes:
//        Student will demonstrate the ability to create abstract classes.
//        Student will demonstrate the ability to create abstract methods.
//        Student will demonstrate the ability to to use both concrete and abstract methods in an abstract class.
//        Student will demonstrate the ability to use abstract methods to impose rules on all child classes.
// ..
// Program Specifications:
//        Make up your own theme for this assignment. (Explain it briefly in your submission comments.)
//        Make up your own classes for this assignment.
//        Create an Abstract Class with Abstract Methods, a class that uses the abstract methods and a test class.
//        Create all necessary setters, getters, constructors and methods.
//        Create a reasonable test case
//        Create UMLs for all non-test case classes.

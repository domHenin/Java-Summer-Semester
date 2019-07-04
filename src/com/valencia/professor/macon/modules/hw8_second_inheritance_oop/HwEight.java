package com.valencia.professor.macon.modules.hw8_second_inheritance_oop;

public class HwEight {
    public static void main(String[] args) {
//        System.out.println("Praise GOD for His salvation.");

        Automobile automobile = new Automobile(73436, "white");

        RaceCar raceCar = new RaceCar(157481, "white", 2002, "Acura", "RSX");

        RaceCar raceCar1 = new RaceCar(00, "black", 2015, "Subaru", "WRX STI");



        System.out.println("My Family Car: "+automobile.toString());

        System.out.println();

        System.out.println("My Personal Car: "+raceCar.toString());

        System.out.println();

        System.out.println("My Dream Car: "+raceCar1.toString());
    }
}


// TODO:
// Programming assignment: Classes and Inheritance
// ..
//        You are to pick your own theme for a new Parent class.  You can pick from one of the following:
//        Automobile
//
//        Based on your choice:
//        If you choose Automobile, you will create a subclass of Automobile called RaceCar.
//
//        Once you pick your theme, you must use the “HAS A” question to determine the fields that you are going to
//        include in your classes.
//
//        For example, an Alarm Clock HAS A:
//
//        Set Hours Button Time
//        Set Minutes Button Time
//        Set Hours Button Alarm
//        Set Minutes Button Alarm
//        Alarm On-Off Button
//        Snooze Button
//
//
//        Tasks:
//
//        Create UMLs for all classes.
//        WRITE JAVA code to create the classes from above.  In the classes you are creating you will include at least three fields or attributes (See sample alarm clock above).
//        Add overloaded methods, and overridden methods.  Label each.  Create a Test class that creates at least 3 objects of each class.
//        The parent and child classes need to have all necessary and required methods.
//        Test your work.
//        Zip up the project folder (no design tool needed).
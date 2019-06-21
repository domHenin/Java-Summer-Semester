package com.valencia.professor.macon.modules.hw6_composite_class_UML;


public class Name {

    private String firName;
    private String middName;
    private String lasName;

    //  SETTERS.
    public void setFirName(String firName) { this.firName = firName; }
    public void setMiddName(String middName) { this.middName = middName; }
    public void setLasName(String lasName) { this.lasName = lasName; }

    //  GETTERS.
    public String getFirName() { return firName; }
    public String getMiddName() { return middName; }
    public String getLasName() { return lasName; }
}

//TODO
// A class that defines a Name (first name, middle name, and last name).
//        Then, define all setters and getters, constructors and toString methods.
// Rules:
// Gender must have three possible values: M, F or O (other).
// Age must be between 1 and 120.
// Salary must be a positive number.
// The first and last name must be in sentence case. (Billy Armstrong)
// A middle name is optional (the code will account for this)
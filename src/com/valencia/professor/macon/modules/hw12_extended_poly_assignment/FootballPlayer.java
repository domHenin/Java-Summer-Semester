package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class FootballPlayer extends Person implements Earnings{

    private String specialty; //offense, defense, special team

//CONSTRUCTOR:
    public FootballPlayer(String name, int age, String specialty) {
        super(name, age);
        setSpecialty(specialty);    //offense, defense, special teams
    }

//OVERRIDE: revenue()
    @Override
    public double revenue() {
        return 14.2; //14.2billion
    }

//OVERRIDE: fans()
    @Override
    public double fans() {
        return 400; //400million
    }

//SETTERS:
    public void setSpecialty(String specialty) { this.specialty = specialty; }

//GETTERS:
    public String getSpecialty() { return specialty; }

//doThis():
    public String doThis() {
        return "I tackle something.";
    }

//toString():
    public String toString() {
        return ""+super.toString()+
                "\nSpecialty: "+specialty;
    }
}

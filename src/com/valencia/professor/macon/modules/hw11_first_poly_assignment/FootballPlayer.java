package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class FootballPlayer extends Person implements Athlete {

    private String specialty; //offense, defense, special team

//CONSTRUCTOR:
    public FootballPlayer(String name, int age, String specialty) {
        super(name, age);
        setSpecialty(specialty);    //offense, defense, special teams
    }

    @Override
    public void team() {

    }

    @Override
    public void position() {

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
package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class Athlete extends Person {

    private String team;
    private String position;

//CONSTRUCTOR:


    public Athlete(String firstName, String middleInitial, String lastName, int age, String team, String positon) {
        super(firstName, middleInitial, lastName, age);
        this.team = team;
        this.position = positon;
    }

    //SETTERS:
    public void setTeam(String team) { this.team = team; }
    public void setPositon(String positon) { this.position = positon; }


//GETTERS:
    public String getTeam() { return team; }
    public String getPositon() { return position; }

    public String toString() {
        return ""+super.toString()+
                "\nTeam: "+team+
                "\nPositoin: "+position;
    }
}

package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class Athlete extends Person {

    private String team;
    private String positon;

//CONSTRUCTOR:
    public Athlete(String name, int age, String team, String positon) {
        super(name, age);
        setTeam(team);
        setPositon(positon);
    }

//SETTERS:
    public void setTeam(String team) { this.team = team; }
    public void setPositon(String positon) { this.positon = positon; }


//GETTERS:
    public String getTeam() { return team; }
    public String getPositon() { return positon; }

    public String toString() {
        return ""+super.toString()+
                "\nTeam: "+team+
                "\nPositoin: "+positon;
    }

}

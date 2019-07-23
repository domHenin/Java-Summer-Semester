package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class GolfPlayer extends Person {

    private String mainSponsor;

//CONSTRUCTOR:
    public GolfPlayer(String name, int age, String mainSponsor) {
        super(name, age);
        setMainSponsor(mainSponsor);
    }


//SETTER:
    public void setMainSponsor(String mainSponsor) { this.mainSponsor = mainSponsor; }

//GETTER:
    public String getMainSponsor() { return mainSponsor; }

//doThis():
    public String doThis() {
        return "I put it in the hole.";
    }

//toString():
    public String toString() {
        return ""+super.toString()+
                "\nSponsor: "+mainSponsor;
    }
}
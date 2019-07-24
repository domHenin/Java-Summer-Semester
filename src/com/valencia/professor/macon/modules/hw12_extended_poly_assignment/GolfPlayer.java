package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class GolfPlayer extends Person implements Earnings {

    private String mainSponsor;

//CONSTRUCTOR:
    public GolfPlayer(String name, int age, String mainSponsor) {
        super(name, age);
        setMainSponsor(mainSponsor);
    }

//OVERRIDE: revenue()
    @Override
    public double revenue() {
        return 70; //70billion
    }

//OVERRIDE: fans()
    @Override
    public double fans() {
        return 450; //450million
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

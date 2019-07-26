package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class GolfPlayer extends Person implements Information {

    private String mainSponsor;

//CONSTRUCTOR:
    public GolfPlayer(String firstName, String middleInitial, String lastName, int age, String mainSponsor) {
        super(firstName, middleInitial, lastName, age);
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

//OVERRIDE: objective()
    @Override
    String objective() {
        return "Get Hole in One.";
    }

//SETTER:
    public void setMainSponsor(String mainSponsor) { this.mainSponsor = mainSponsor; }

//GETTER:
    public String getMainSponsor() { return mainSponsor; }

//doThis():
    public String doThis() {
        return "I putt it in the hole.";
    }

//EQUALS:
    public boolean equals(Object obj) {
        if (!(obj instanceof GolfPlayer)) {
            return false;
        }

        boolean result = false;

        if ( super.getFirstName() == ((GolfPlayer) obj).getFirstName() ) {
            result = true;
        }

        return result;
    }
    //compare name

//toString():
    public String toString() {
        return ""+super.toString()+
                "\nSponsor: "+mainSponsor+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" million";
    }
}

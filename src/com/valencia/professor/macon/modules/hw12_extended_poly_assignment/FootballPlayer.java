package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class FootballPlayer extends Person implements Information {

    private String specialty; //offense, defense, special team

//CONSTRUCTOR:
    public FootballPlayer(String firstName, String middleInitial, String lastName, int age, String specialty) {
        super(firstName, middleInitial, lastName, age);
        setSpecialty(specialty);
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

//OVERRIDE: objective()
    @Override
    String objective() {
        return "Get Touchdown.";
    }

//SETTERS:
    public void setSpecialty(String specialty) { this.specialty = specialty; }

//GETTERS:
    public String getSpecialty() { return specialty; }

//doThis():
    public String doThis() {
        return "I tackle something.";
    }

//EQUALS:
    public boolean equals(Object obj) {
        if (!(obj instanceof FootballPlayer)) {
            return false;
        }

        boolean result = false;

        if ( super.getFirstName() == ((FootballPlayer) obj).getFirstName() ) {
            result = true;
        }

        return result;
    }
    //compare name

//toString():
    public String toString() {
        return "\nFootball Information"+
                "\n----------------------"+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" million"+
                "\n======================="+
                "\n"+super.getFirstName()+"'s Info"+
                ""+super.toString()+
                "\nSpecialty: "+specialty+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" million";
    }
}

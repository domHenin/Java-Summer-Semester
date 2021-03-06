package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class HockeyPlayer extends Person implements Information {

    private String stickBrand;


//CONSTRUCTOR:
    public HockeyPlayer(String firstName, String middleInitial, String lastName, int age, String stickBrand) {
        super(firstName, middleInitial, lastName, age);
        setStickBrand(stickBrand);

    }

//OVERRIDE: revenue()
    @Override
    public double revenue() {
        return 5.2; //5.2billion
    }

//OVERRIDE: fans()
    @Override
    public double fans() {
        return 2.9; //2.9million
    }

//OVERRIDE: objective()
    @Override
    String objective() {
        return "Shoot puck in opponent's goal.";
    }

//SETTER:
    public void setStickBrand(String stickBrand) { this.stickBrand = stickBrand; }


//GETTER:
    public String getStickBrand() { return stickBrand; }

//doThis():
    public String doThis() {
        return "I sit in a penalty box.";
    }

//EQUALS:
    public boolean equals(Object obj) {
        if (!(obj instanceof HockeyPlayer)) {
            return false;
        }

        boolean result = false;

        if ( super.getFirstName() == ((HockeyPlayer) obj).getFirstName() ) {
            result = true;
        }

        return result;
    }
    //compare name


//toString():
    public String toString() {
        return "\nHockey Information"+
                "----------------------"+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" million"+
                "\n======================="+
                "\n"+super.getFirstName()+"'s Info"+
                ""+super.toString()+
                "\nBrand of Stick: "+stickBrand;
    }
}

//TODO:
// create methods for skater and goalie to extend hockey
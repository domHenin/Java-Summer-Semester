package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class HockeyPlayer extends Person implements Information {

    private String stickBrand;
//    private boolean skater;
//    private boolean goalie;

//CONSTRUCTOR:
    public HockeyPlayer(String firstName, String middleInitial, String lastName, int age, String stickBrand) {
        super(firstName, middleInitial, lastName, age);
        setStickBrand(stickBrand);
//        setSkater(skater);
//        setGoalie(goalie);
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

//SETTER:
    public void setStickBrand(String stickBrand) { this.stickBrand = stickBrand; }
//    public void setSkater(boolean skater) { this.skater = skater; }
//    public void setGoalie(boolean goalie) { this.goalie = goalie; }

    //GETTER:
    public String getStickBrand() { return stickBrand; }
//    public boolean isSkater() { return skater; }
//    public boolean isGoalie() { return goalie; }

    //doThis():
    public String doThis() {
        return "I sit in a penalty box.";
    }


//toString():
    public String toString() {
        return ""+super.toString()+
                "\nBrand of Stick: "+stickBrand;
    }
}

//TODO:
// create methods for skater and goalie to extend hockey
package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class HockeyPlayer extends Person implements Earnings {

    private String stickBrand;

//CONSTRUCTOR:
    public HockeyPlayer(String firstName, String middleInitial, String lastName, int age, String stickBrand) {
        super(firstName, middleInitial, lastName, age);
        this.stickBrand = stickBrand;
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

//GETTER:
    public String getStickBrand() { return stickBrand; }


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


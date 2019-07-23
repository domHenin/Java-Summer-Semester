package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class HockeyPlayer extends Person implements Athlete {

    private String stickBrand;

//CONSTRUCTOR:
    public HockeyPlayer(String name, int age, String stickBrand) {
        super(name, age);
        setStickBrand(stickBrand);
    }

    @Override
    public void team() { }

    @Override
    public void position() { }

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

package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class HockeyPlayer extends Person {

    private String stickBrand;

//CONSTRUCTOR:
    public HockeyPlayer(String name, int age, String stickBrand) {
        super(name, age);
        setStickBrand(stickBrand);
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

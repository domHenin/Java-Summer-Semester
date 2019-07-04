package com.valencia.professor.macon.modules.hw8_second_inheritance_oop;

public class Automobile extends HwEight {
    private int milage;
    private String color;

//CONSTRUCTOR.
    public Automobile(int milage, String color) {
        this.milage = milage;
        this.color = color;
    }


//SETTERS.
    public void setMilage(int milage) { this.milage = milage; }
    public void setColor(String color) { this.color = color; }


//GETTERS.
    public int getMilage() { return milage; }
    public String getColor() { return color; }

//toString().
    public String toString() {
        return "An Automobile with the Milage of: "+milage+
                " and Color: "+color;
    }

}

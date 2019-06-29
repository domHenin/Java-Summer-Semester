package com.valencia.professor.macon.modules.hw7_inheritance_oop;

public class Bird extends Animal {
    private double wingspan;
    private boolean fly;

    public Bird(double weight, double height,  double wingspan, boolean fly) {
        super(weight, height);
        setWingspan(wingspan);
        this.wingspan=wingspan;
        this.fly=fly;
    }

//SETTERS:
    public void setWingspan(double wingspan) { this.wingspan=wingspan; }
    public void setFly(boolean fly) { this.fly=fly; }

//GETTERS:
    public double getWingspan() { return wingspan; }
    public boolean getFly() { return fly; }

//toString:
    public String toString() {

        return "Bird: "+super.toString()+" Wingspan: "+wingspan+" Can FLy: "+canFly();
    }

    public boolean canFly() {
        return Math.random() < 0.5;
    }
}


// TODO:
// Program Specifications:
// Then, add the following:
// Animals have a Weight.
// Animals have a Height.
// Bird is an Animal
// Birds have a wing span
// Birds have a canFly which is true or false (some birds cannot fly)
// Create a test class that creates one of each type of animal and displays the animal’s toString method.
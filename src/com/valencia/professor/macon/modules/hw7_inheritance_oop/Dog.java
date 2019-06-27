package com.valencia.professor.macon.modules.hw7_inheritance_oop;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double dOb;

//CONSTRUCTOR:
    public Dog(double weight, double height, String name, String breed, double dOb) {
        super(weight, height);
        this.name = name;
        this.breed = breed;
        this.dOb = dOb;
    }

//GETTERS:
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }
    public void setdOb(double dOb) { this.dOb = dOb; }


//SETTERS:
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public double getdOb() { return dOb; }

    public String toString() {
        return "Dog: Name: "+name+" "+super.toString();
    }

}

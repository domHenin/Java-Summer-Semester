package com.valencia.professor.macon.modules.hw7_inheritance_oop;

public class Animal {

//VARIABLES:
    private double weight;
    private double height;

//CONSTRUCTOR:
    public Animal(double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }

//SETTERS:
    public void setWeight(double weight) { this.weight=weight; }
    public void setHeight(double height) { this.height=height; }

//GETTERS:
    public double getWeight() { return weight; }
    public double getHeight() { return height; }

    public String toString() {
        return "I'am animal with the height of "+height+"inchs and the weight of "+weight+"lbs.";
    }

}

// TODO:
// Program Specifications:
// Start by watching Video Segment 16 from Dr. Colin Archibald's video series (found in the module overview(.  Key in the program shown in the video and make sure it works.
//        Then, add the following:
//
//
//        Animals have a Weight.
//        Animals have a Height.
//        Dog is an Animal.
//        Dogs have a Name.
//        Dogs have a Breed.
//        Dogs have a DOB.
//        Cat is an Animal
//        Cats have a Name.
//        Cats have 9 lives, so you need to keep track of the remaining lives once a cat dies.
//        Bird is an Animal
//        Birds have a wing span
//        Birds have a canFly which is true or false (some birds cannot fly)
//        Create a test class that creates one of each type of animal and displays the animal’s toString method.
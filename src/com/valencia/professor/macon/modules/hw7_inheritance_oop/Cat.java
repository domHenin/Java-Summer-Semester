package com.valencia.professor.macon.modules.hw7_inheritance_oop;

public class Cat extends Animal {
    private String name;
    private int life;

//CONSTRUCTOR:
    public Cat(double weight, double height, String name, int life) {
        super(weight, height);
        setName(name);
        setLife(life);
    }

//GETTERS:
    public void setName(String name) { this.name = name; }
    public void setLife(int life) { this.life = life; }

//SETTERS:
    public String getName() { return name; }
    public int getLife() { return life; }

//toString:
    public String toString() {
        return "Cat: Name: "+name+" I have "+life+" lives. "+super.toString();
    }

}


// TODO:
// Program Specifications:
// Then, add the following:
// Animals have a Weight.
// Animals have a Height.
// Cat is an Animal
// Cats have a Name.
// Cats have 9 lives, so you need to keep track of the remaining lives once a cat dies.
// Create a test class that creates one of each type of animal and displays the animal’s toString method.
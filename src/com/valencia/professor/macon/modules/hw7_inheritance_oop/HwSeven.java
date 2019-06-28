package com.valencia.professor.macon.modules.hw7_inheritance_oop;

public class HwSeven {
    public static void main(String[] args) {
//        System.out.println("to GOD all glory!");

        Animal animal = new Animal(120, 5);
        System.out.println(animal);

        Dog dog = new Dog(90, 3, "gizmo", "german sheperd", 25);
        System.out.println(dog);

        Bird bird = new Bird(35, 20, 90, true);
        System.out.println(bird);

        Cat cat = new Cat(12, 15, "shadow", 9);
        System.out.println(cat);

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
package com.valencia.professor.macon.modules.hw10_java_interface;

public class HwTen {
    public static void main(String[] args) {
//        System.out.println("thank you GOD for being my provider.");

        Team team = new Team(6, "California", "OakLand", "Warriors");

        System.out.println();
        System.out.println(team);

        System.out.println("-----------------------------------");
        onwerInfo(team);
        System.out.println("-----------------------------------");
        couchInfo(team);
        System.out.println("-----------------------------------");
        playerInfo(team);
        System.out.println("-----------------------------------");

    }

    public static void onwerInfo(Owner owner) {
        System.out.println("Owner's Information::");
        System.out.println("Net Worth: $"+owner.netWorth()+" million USD.");
        System.out.println("Year In Role: "+owner.yearsInRole()+" years.");
    }

    public static void couchInfo(Coach coach) {
        System.out.println("Coach's Information::");
        System.out.println("Salary: $"+coach.salary()+" million USD.");
        System.out.println("Years as Coach: "+coach.yearsAsCoach()+" years.");
    }

    public static void  playerInfo(Player player) {
        System.out.println("Player's Information::");
        System.out.println("Name: "+player.name());
        System.out.println("Age: "+player.age());
        System.out.println("Height: "+player.height()+"inches.");
        System.out.println("Weight: "+player.weight()+"lbs");
        System.out.println("Jersey Number: "+player.jerseyNumber());
    }

}


//THOUGHT: TEAM -> COACH -> PLAYER

// team HAS A number of couch
// team HAS A number of player
// team HAS A state
// team HAS A

// ------------------------- //
// coach HAS A player
// coach HAS A number of players
// coach HAS A trophy amount
// coach HAS A salary

// ------------------------- //
// player HAS A couch
// player HAS A number
// player HAS A weight
// player HAS A height
// player HAS A


//TODO:
// Java Interface Assignment
// Outcomes:
//   Student will demonstrate the ability to create and use abstract classes and interfaces.
//   Student will be able to distinguish the purpose of an interface as opposed to an abstract class.
// ..
// Program Specifications:
//        Make up your own theme. (Explain it briefly in your submission comments.)
//        Make up your own classes.
//        Make up your own abstract classes.
//        Make up your own interfaces.
//        Create 3 Interfaces with Abstract Methods, a class that uses all three interfaces and implements their methods and a test class.
//        Create all necessary setters, getters, constructors and methods.
//        Create a reasonable test case.
//        Create UMLs for all non-test case classes..
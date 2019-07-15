package com.valencia.professor.macon.modules.hw10_java_interface;

public class Team implements Owner, Coach, Player {

    private int numberOfChampionships;
    private String state;
    private String city;
    private String name;


//OWNER: Override
    @Override
    public int yearsInRole() {
        return 10;
    }

    @Override
    public double netWorth() { return 800; }

//COACH: Override
    @Override
    public int yearsAsCoach() { return 5; }

    @Override
    public int salary() { return 5; }

    @Override
    public int numberOfPlayers() { return 20; }

//PLAYER: Override
    @Override
    public String name() { return "Klay Thompson"; }

    @Override
    public int jerseyNumber() { return 11; }

    @Override
    public int weight() { return 216; }

    @Override
    public int height() { return 79; }

    @Override
    public int age() { return 29; }

//CONSTRUCTOR:
    public Team(int numberOfChampionships, String state, String city, String name) {
        setNumberOfChampionships(numberOfChampionships);
        setState(state);
        setCity(city);
        setName(name);
    }

//SETTERS:
    public void setNumberOfChampionships(int numberOfChampionships) { this.numberOfChampionships = numberOfChampionships; }
    public void setState(String state) { this.state=state; }
    public void setCity(String city) { this.city = city; }
    public void setName(String name) { this.name=name; }


//GETTERS:
    public int getNumberOfChampionships() { return numberOfChampionships; }
    public String getState() { return state; }
    public String getCity() { return city; }
    public String getName() { return name; }

//toString():
    public String toString() {
        return "Teams Name: "+getName()+
                "\nTeams State: "+getState()+
                "\nTeams City: "+getCity()+
                "\nTeams Number of Champions: "+getNumberOfChampionships();
    }
}

//TODO:
// team HAS A number of rings
// team HAS A city
// team HAS A state
// team HAS A name


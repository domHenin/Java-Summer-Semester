package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class SoccerPlayer extends Person implements Information {

    private String fieldposition; //goalKeeper, defender, midFielder, forward

//CONSTRUCTOR:
    public SoccerPlayer(String firstName, String middleInitial, String lastName, int age, String fieldposition) {
        super(firstName, middleInitial, lastName, age);
        setFieldposition(fieldposition);
    }

//OVERRIDE: revenue()
    @Override
    public double revenue() {
        return 1.69; //1.69billion
    }

//OVERRIDE: fans()
    @Override
    public double fans() {
        return 3.5; //3.5billion
    }

//SETTER:
    public void setFieldposition(String fieldposition) { this.fieldposition = fieldposition; }

//GETTER:
    public String getFieldposition() { return fieldposition; }


//doThis():
    public String doThis() {
        return "I kick the ball.";
    }

//toString():
    public String toString() {
        return ""+super.toString()+
                "\nposition: "+fieldposition+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" billion";
    }
}

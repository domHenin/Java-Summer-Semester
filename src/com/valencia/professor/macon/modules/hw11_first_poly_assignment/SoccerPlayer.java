package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class SoccerPlayer extends Person {

    private String fieldPosition; //goalKeeper, defender, midFielder, forward

//CONSTRUCTOR:
    public SoccerPlayer(String name, int age, String fieldPosition) {
        super(name, age);
        setFieldPosition(fieldPosition);
    }

//SETTER:
    public void setFieldPosition(String fieldPosition) { this.fieldPosition = fieldPosition; }

//GETTER:
    public String getFieldPosition() { return fieldPosition; }


//doThis():
    public String doThis() {
        return "I kick the ball.";
    }

//toString():
    public String toString() {
        return ""+super.toString()+
                "\nPosition: "+fieldPosition;
    }
}

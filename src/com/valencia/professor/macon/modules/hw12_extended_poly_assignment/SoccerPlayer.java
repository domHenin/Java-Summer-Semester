package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class SoccerPlayer extends Person implements Earnings {

    private String fieldPosition; //goalKeeper, defender, midFielder, forward

//CONSTRUCTOR:
    public SoccerPlayer(String name, int age, String fieldPosition) {
        super(name, age);
        setFieldPosition(fieldPosition);
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
                "\nPosition: "+fieldPosition+
                "\nRevenue: "+revenue();
    }
}

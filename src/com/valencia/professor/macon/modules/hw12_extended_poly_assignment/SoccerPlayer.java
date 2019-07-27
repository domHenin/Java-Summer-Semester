package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class SoccerPlayer extends Person implements Information {

    private String fieldPosition; //goalKeeper, defender, midFielder, forward

//CONSTRUCTOR:
    public SoccerPlayer(String firstName, String middleInitial, String lastName, int age, String fieldPosition) {
        super(firstName, middleInitial, lastName, age);
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

//OVERRIDE: objective()
    @Override
    String objective() {
        return "Advancing the ball down field into the opposing team's goal.";
    }

//SETTER:
    public void setFieldPosition(String fieldPosition) { this.fieldPosition = fieldPosition; }

//GETTER:
    public String getFieldPosition() { return fieldPosition; }


//doThis():
    public String doThis() {
        return "I kick the ball.";
    }

//EQUALS:
    public boolean equals(Object obj) {
        if (!(obj instanceof SoccerPlayer)) {
            return false;
        }

        boolean result = false;

        if ( super.getFirstName() == ((SoccerPlayer) obj).getFirstName() ) {
            result = true;
        }

        return result;
    }
    //compare name

//toString():
    public String toString() {
        return "\nSoccer Information"+
                "\n----------------------"+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" billion"+
                "\n======================="+
                "\n"+super.getFirstName()+"'s Info"+
                ""+super.toString()+
                "\nposition: "+fieldPosition;
    }
}

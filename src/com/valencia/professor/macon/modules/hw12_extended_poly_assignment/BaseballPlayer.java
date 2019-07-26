package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;



public class BaseballPlayer extends Person implements Information {
    private int battingPosition;
    private String battingStyle; //left, right or both hands

//CONSTRUCTOR:
    public BaseballPlayer(String firstName, String middleInitial, String lastName, int age, int battingposition, String battingStyle) {
        super(firstName, middleInitial, lastName, age);
        setBattingPosition(battingposition);
        setBattingStyle(battingStyle);
    }

//OVERRIDE: objective()
    @Override
    String objective() {
        return "Score more runs than the opponent.";
    }

//OVERRIDE: revenue()
    @Override
    public double revenue() {
        return 10; //10billion
    }

//OVERRIDE: fans()
    @Override
    public double fans() {
        return 500; //500million
    }

//SETTERS:
    public void setBattingPosition(int battingposition) { this.battingPosition = battingposition; }
    public void setBattingStyle(String battingStyle) { this.battingStyle = battingStyle; }


//GETTERS:
    public int getBattingPosition() { return battingPosition; }
    public String getBattingStyle() { return battingStyle; }


//doThis():
    public String doThis() {
        return "I hit something.\n";
    }

    //EQUALS:
    public boolean equals(Object obj) {
        if (!(obj instanceof BaseballPlayer)) {
            return false;
        }

        boolean result = false;

        if ( super.getFirstName() == ((BaseballPlayer) obj).getFirstName() ) {
            result = true;
        }

        return result;
    }
    //compare name

//toString():
    public String toString() {
        return  "\n Baseballs Information"+
                "\n----------------------"+
                "\nRevenue: $"+revenue()+" billion"+
                "\nFans: "+fans()+" million"+
                "\n======================="+
                "\n"+super.getFirstName()+"'s Info"+
                ""+super.toString()+
                "\nBatting position: "+battingPosition+
                "\nBatting Style: "+battingStyle;
    }
}

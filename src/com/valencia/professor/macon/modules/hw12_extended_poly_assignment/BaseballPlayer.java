package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

public class BaseballPlayer extends Person implements Earnings {
    private int battingposition;
    private String battingStyle; //left, right or both hands

//CONSTRUCTOR:
    public BaseballPlayer(String firstName, String middleInitial, String lastName, int age, int battingposition, String battingStyle) {
        super(firstName, middleInitial, lastName, age);
        this.battingposition = battingposition;
        this.battingStyle = battingStyle;
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
    public void setBattingposition(int battingposition) { this.battingposition = battingposition; }
    public void setBattingStyle(String battingStyle) { this.battingStyle = battingStyle; }


//GETTERS:
    public int getBattingposition() { return battingposition; }
    public String getBattingStyle() { return battingStyle; }


//doThis():
    public String doThis() {
        return "I hit something.\n";
    }


//toString():
    public String toString() {
        return  ""+super.toString()+
                "\nBatting position: "+battingposition+
                "\nBatting Style: "+battingStyle;
    }
}

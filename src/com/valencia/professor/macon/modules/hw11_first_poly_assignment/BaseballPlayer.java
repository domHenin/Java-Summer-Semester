package com.valencia.professor.macon.modules.hw11_first_poly_assignment;

public class BaseballPlayer extends Person {

    private int battingPosition;
    private String battingStyle; //left, right or both hands

    public BaseballPlayer(String name, int age, int battingPosition, String battingStyle) {
        super(name, age);
        setBattingPosition(battingPosition);
        setBattingStyle(battingStyle);
    }

    //SETTERS:
    public void setBattingPosition(int battingPosition) { this.battingPosition = battingPosition; }
    public void setBattingStyle(String battingStyle) { this.battingStyle = battingStyle; }


//GETTERS:
    public int getBattingPosition() { return battingPosition; }
    public String getBattingStyle() { return battingStyle; }


//doThis():
    public String doThis() {
        return "I hit something.\n";
    }


//toString():
    public String toString() {
        return ""+super.toString()+
                "\nBatting Position: "+battingPosition+
                "\nBatting Style: "+battingStyle;
    }
}
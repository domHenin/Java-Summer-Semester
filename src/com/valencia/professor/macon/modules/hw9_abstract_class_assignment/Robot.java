package com.valencia.professor.macon.modules.hw9_abstract_class_assignment;

public class Robot extends Machine {

    private String saying;
    private String name;
    private int chargeTime;

    public Robot(int model, String saying, String name, int chargeTime) {
        super(model);
        setSaying(saying);
        setName(name);
        setChargeTime(chargeTime);
    }

//SETTERS:
    public void setSaying(String saying) { this.saying = saying; }
    public void setName(String name) { this.name = name; }
    public void setChargeTime(int chargeTime) { this.chargeTime = chargeTime; }


    @Override
    public void objective() {
        System.out.println("Assist with Directions.");
    }

    //GETTERS:
    public String getSaying() { return saying; }
    public String getName() { return name; }
    public int getChargeTime() { return chargeTime; }

//toString():
    public String toString() {
        return ""+super.toString()+
               " \nRobot: Saying: "+saying+
               " \nName: "+name+
               " \nCharge Percent: "+chargeTime+"%";
    }

//    public void shouldCharge() {
//        if (chargeTime )
//    }

}


//  TODO:
//saying
//duty
//charge time -> for loop to iterate through percentage

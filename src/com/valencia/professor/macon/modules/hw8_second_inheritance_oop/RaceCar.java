package com.valencia.professor.macon.modules.hw8_second_inheritance_oop;

public class RaceCar extends Automobile {
    private int year;
    private String model;
    private String make;

//CONSTRUCTOR.
    public RaceCar(int milage, String color, int year, String make, String model) {
        super(milage, color);
        setYear(year);
        setMake(make);
        setModel(model);
    }

//SETTERS.
    public void setYear(int year) { this.year = year; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }


//GETTERS.
    public int getYear() { return year; }
    public String getMake() { return make; }
    public String getModel() { return model; }

//toString().
    public String toString() {
        return "Race Car:: "+" "+super.toString()+
                " Year: "+year+
                " Make: "+make+
                " Model: "+model;
    }
}


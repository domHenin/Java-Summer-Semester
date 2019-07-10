package com.valencia.professor.macon.modules.hw9_abstract_class_assignment;

public class Computer extends Machine {

    private int ram;
    private int hddSize;
    private String brand;
    private String type;

    public Computer(int model, int ram, int hddSize, String brand, String type) {
        super(model);
        setRam(ram);
        setHddSize(hddSize);
        setBrand(brand);
        setType(type);
    }

    @Override
    public void objective() {
        System.out.println("Objective: Run Ubuntu OS / Build Software");
    }

    //SETTERS:
    public void setRam(int ram) { this.ram = ram; }
    public void setHddSize(int hddSize) { this.hddSize = hddSize; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setType(String type) { this.type = type; }


//GETTERS:
    public int getRam() { return ram; }
    public int getHddSize() { return hddSize; }
    public String getBrand() { return brand; }
    public String getType() { return type; }

//toString():
    public String toString() {
        return ""+super.toString()+
                " \nComputer: Ram Size: "+ram+"GB"+
                " \nComputer: SSD Size: "+hddSize+"tb"+
                " \nComputer: Brand: "+brand+
                " \nType of Workstation: "+type;
    }

}

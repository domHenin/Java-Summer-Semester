package com.valencia.professor.macon.modules.hw9_abstract_class_assignment;

abstract public class Machine {

    private int model;
//CONSTRUCTOR:
    public Machine(int model) { setModel(model); }

    abstract public void objective();


//SETTER:
    private void setModel(int model) { this.model=model; }

//GETTER:
    public int getModel() { return model; }

//toString():
    public String toString() {
        return "Machine Info: Model:: v." +model;
    }
}

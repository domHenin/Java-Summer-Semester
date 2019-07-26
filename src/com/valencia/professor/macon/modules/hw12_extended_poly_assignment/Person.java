package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

abstract class Person {
    private String firstName;
    private String middleInitial;
    private String lastName;
    private int age;

//CONSTRUCTOR:
    public Person(String firstName, String middleInitial, String lastName, int age) {
        setFirstName(firstName);
        setMiddleInitial(middleInitial);
        setLastName(lastName);
        setAge(age);
    }

//ABSTRACT:
    abstract String objective();

//SETTERS:
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleInitial(String middleInitial) { this.middleInitial = middleInitial; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }

//GETTERS:
    public String getFirstName() { return firstName; }
    public String getMiddleInitial() { return middleInitial; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

//toString():
    public String toString() {
        return  "\nFirst Name: "+firstName+
                "\nMiddle Initial: "+middleInitial+
                "\nLast Name: "+lastName+
                "\nAge: "+age;
    }
}

package src.com.valencia.professor.macon.modules.hw6_composite_class_UML;

import java.util.Scanner;

public class Name {

    Scanner scanner = new Scanner(System.in);

    private String name;

    private String firName;
    private String middName;
    private String lasName;

    //  SETTERS.
    public void setName(String name) { this.name=name; }
    public void setFirName(String firName) { this.firName = firName; }

    public void setMiddName(String middName) { this.middName = middName; }

    public void setLasName(String lasName) { this.lasName = lasName; }

    //  GETTERS.
    public String getName() { return name; }
    public String getFirName() { return firName; }

    public String getMiddName() { return middName; }

    public String getLasName() { return lasName; }


//TODO: clean up code. delete if not using logic
//TODO: maybe use logic for the 'n' option to capitalize as requested.
//    public void grabName() {
////        String choice;
//
//        System.out.println("Enter Full Name: ");
//        name = scanner.nextLine();
//
//        firName=name.substring(0, name.indexOf(" "));
//        lasName=name.substring(name.indexOf(" ")+1);
//
//        String cap = Character.toString(firName.charAt(0)).toUpperCase();
//        firName = cap + firName.substring(1);
//
//        cap = Character.toString(lasName.charAt(0)).toUpperCase();
//        lasName=cap + lasName.substring(1);
//
//        System.out.println("Name: "+firName+" "+lasName);
//        System.out.println();
//    }
}

//TODO
// A class that defines a Name (first name, middle name, and last name).
//        Then, define all setters and getters, constructors and toString methods.
// Rules:
// Gender must have three possible values: M, F or O (other).
// Age must be between 1 and 120.
// Salary must be a positive number.
// The first and last name must be in sentence case. (Billy Armstrong)
// A middle name is optional (the code will account for this)


//TODO: delete if no use
//CODE GRAVEYARD::
//  middle name LOGIC ATTEMPT
//    public String grabName() {
//        String choice;
//
//        System.out.println("Do you have a Middle Name? [Y]es / [N]o");
//        choice=scanner.next();
//
//        if (choice.equals("y")) {
//            System.out.println("Enter First Name: ");
////            setFirName(scanner.nextLine());
//            firName=scanner.nextLine();
//
//            scanner.nextLine();
//
//            System.out.println("Enter Middle Name: ");
////            setMiddName(scanner.nextLine());
//            middName=scanner.nextLine();
//
//            System.out.println("Enter Last Name: ");
////            setLasName(scanner.nextLine());
//        } else if (choice.equals("n")) {
//            System.out.println("Enter First Name: ");
//            firName=scanner.nextLine();
//
//            scanner.nextLine();
//
//            System.out.println("Enter Last Name: ");
//        }
//
//        return getFirName();
//    }

//    public String grabName(String firName){
//        setFirName(scanner.nextLine());
//    }
//}
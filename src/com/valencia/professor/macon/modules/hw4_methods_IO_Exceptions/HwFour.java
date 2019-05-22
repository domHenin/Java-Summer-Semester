package com.valencia.professor.macon.modules.hw4_methods_IO_Exceptions;

import java.util.Scanner;
import java.lang.Math;

public class HwFour {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("have mercy upon me, oh GOD of abraham, issac, and jacob");

//        int count=20;

        System.out.println("Name: ");
        String name = scanner.nextLine();

        for (int i=0; i<=20; i++){
            System.out.println(i+" "+name);
        }



        System.out.println("Choose an option: ");
        int option = 0;

        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter first name: ");
                String userName = scanner.nextLine();

                for (int i=1; i<=20; i++){
                    System.out.println(i+" "+userName);
                }
                break;

            case 2:
                System.out.println("Enter age: ");
                int userAge = scanner.nextInt();
                int getAge = userAge * 2;
                break;
        }
    }
}


//TODO:
// your assignment is to write a menu driven program.  The menu will be responded to using a switch statement.
// The menu options (cases) will be as follows (You should give them more succinct labels in your program):
// ..
// Read the user’s first name and echo it back out 20 times.
// Read the user’s age and double it and display the age and the doubled age.
// Read the user's age and output one of the following statements:
// Since you are xx years old, you are a teenager
// Since you are xx years old, you are NOT a teenager   (***of course xx displays the user's age)
// Read a single integer between 3 and 50 from the user. Create a triangle of X’s with the as many rows as the value
// of the user's input.  The triangle needs to be displayed on the screen and in a text document named triangle.txt.
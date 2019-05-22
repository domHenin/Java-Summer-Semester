package com.valencia.professor.macon.modules.hw4_methods_IO_Exceptions;

import java.util.Scanner;
import java.lang.Math;

public class HwFour {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("have mercy upon me, oh GOD of abraham, issac, and jacob");

        char option;

        do {
            option = getChoice();

            switch (option) {
                case 'N':
                    System.out.println("Enter first name: ");
                    String userName = scanner.nextLine();
                    System.out.println(userName+"\n");
                for (int i=1; i<=20; i++){
                    System.out.println(i+" "+userName+"\n");
                }
                    break;

                case 'A':
                    System.out.println("Enter age: ");
                    int userAge = scanner.nextInt();
                    int getAge = userAge * 2;

                    System.out.println("Age Doubled: "+getAge);

                    if (userAge >= 10 && userAge <= 19){
                        System.out.printf("Since you are %d years old, you are a teenager\n", userAge);
                    } else {
                        System.out.printf("Since you are %d years old, you are NOT a teenager\n", userAge);
                    }
                    break;

                case 'I':
                    int newVal;

                    System.out.println("Enter Number (3-50): ");
                    newVal = scanner.nextInt();

                    if (newVal >= 3 && newVal <= 50) {
                        buildTriangle(newVal);
                    } else {
                        System.out.println("ERROR!");
                    }
                    break;

                default:
                    break;
            }
        } while (option != 'Q');


    }

    public static char getChoice() {
        char result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("#########################");
        System.out.println("# User [N]ame\t\t\t#");
        System.out.println("# User [A]ge\t\t\t#");
        System.out.println("# User [I]nteger Input\t#");
        System.out.println("# [Q]uit Program\t\t#");
        System.out.println("#########################");

        System.out.println("Enter Selection: ");

        result = scanner.nextLine().toUpperCase().charAt(0);

        return result;
    }

    public static void buildTriangle(int n) {
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
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
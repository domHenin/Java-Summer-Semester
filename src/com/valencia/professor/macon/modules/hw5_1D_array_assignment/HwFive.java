///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            HW 5: 1D Array Assignment
// Semester:         (cop2800c) Summer 2019
//
// Author:           Dominic Heningburg
// Date:             6/10/2019
//
//////////////////// ``````````````````````````````````` ////////////////////

package com.valencia.professor.macon.modules.hw5_1D_array_assignment;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class HwFive {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//       System.out.println("blessed is the name of JESUS, the name above all names.");

        double[] myArray = new double[10];
        int max=100;
        int min=0;
        int range = max - min +1;
        double maxArray = myArray[0];
        double minArray = Integer.MAX_VALUE;




//  Randomize Array.
        for (int i=1; i< myArray.length; i++) {
            myArray[i] = (Math.random() * range) + min;
            System.out.printf("%.0f\n", myArray[i]);
        }

// WORKING ON SORT ASCENDING: https://www.tutorialspoint.com/java/util/arrays_sort_double.htm --> COMPLETE
        Arrays.sort(myArray);
        System.out.println("Sorted Array: ");

        for (double sortArray : myArray) {
            System.out.printf("%.0f ",sortArray);
        }



// Max & Min Array.
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] > maxArray) {
                maxArray = myArray[i];
            }

            if (myArray[i] < minArray) {
                minArray = myArray[i];
            }
        }
        System.out.printf("\nMax Array Value: %.0f\n", maxArray);
        System.out.printf("Min Array Value: %.0f\n", minArray);

// WORKING ON PRINTING OUT MINIMUM ARRAY.

//        for (int i=1; i < myArray.length; i++) {
//            if (myArray[i] < minArray) {
//                minArray = myArray[i];
//            }
//        }

// Average in MAIN:
        double result;
        result = calculateAverage(myArray);

        System.out.printf("The average is: %.0f\n", result);

//test: userInput
        System.out.println("enter a number: [1-100]");

        double choice = scanner.nextDouble();

        if (choice >= 1 && choice <= 100) {
            System.out.println("searching for number");
        } else {
            System.out.println("ERROR!");
        }



        for (choice : myArray) {


            System.out.println(choice);
        }


    } //end of MAIN.

// METHOD: calculate the average.
    static double calculateAverage(double[] array) {
        double average, sum=0.0;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        return average;
    }

// METHOD: sort the array.

//METHOD: userChoice
    static double obtainInput(int choice) {
        choice = scanner.nextInt();

        System.out.println("Enter a number [1-100]");

        if (choice >=1 || choice <= 100) {
            System.out.println("inside 'if statement in method'");
        } else {
            System.out.println("ERROR!");
        }

        return choice;
    }

}

//TODO:
//        Program Specifications:
//        Write a program that does the following:
// ..
//        Create an array of 100 integers.
//        Store 100 random integers (between 1 and 100) in the array.
//        Print out the elements of the array.
//        Sort the array in ascending order. --> COMPLETE
//        Print out the sorted array. --> COMPLETE
//        Prompt the user to enter a number between 1 and 100. Search the array for that number and then display  "Found" or "Not Found" message.
//        Display each number from 1 to 100 and the number of times each is found in the array.
//        Display the average of the numbers in the array. --> COMPLETE
//        Display the highest number in the array. --> COMPLETE
//        Display the lowest number in the array. --> COMPLETE
// ..
//        Other requirements.
// ..
//        Everything should be done using METHODS.
//        NO NEED FOR A MENU SYSTEM. Just call the methods in the sequence above.
//        Add your design tool to your project.


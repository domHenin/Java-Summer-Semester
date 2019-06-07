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

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class HwFive {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//     System.out.println("blessed is the name of JESUS, the name above all names.");

        int[] myArray = new int[100];

//  Randomize Array:
        System.out.println("Printed Array:");
        Random randomArray = new Random();
        int[] myArrayTest = new int[10];

        for (int i=0; i<myArray.length; i++) {
            myArray[i] = randomArray.nextInt(100);
            System.out.println(myArray[i]);
        }

//  Calling Methods:
        sortArray(myArray);
        calculateAverage(myArray);
        getMaxMinValue(myArray);
        obtainInput(myArray);

    } //end of MAIN.

    // METHOD: calculate the average.
    static void calculateAverage(int[] array) {
        double average, sum=0.0;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        System.out.println("Array Average:"+average);
    }


    // METHOD: sort the array.
    public static void sortArray(int[] array) {
        Arrays.sort(array);

        System.out.print("Sorted Array:");

        for (int i=0; i<array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    //  METHOD: Max&Min Value.
    public static void getMaxMinValue(int[] array) {
        Arrays.sort(array);

        System.out.println("Minimum Value:"+ array[0]);
        System.out.println("Maximum Value:"+array[array.length - 1]);
    }


    //METHOD: search array.
    static void obtainInput(int[] array) {
        int searchNum;
        boolean ifFound = false;

        System.out.println("Enter a number [1-100]");
        searchNum = scanner.nextInt();

        if (searchNum >=1 && searchNum <= 100) {
            for (int i=0; i<array.length; i++) {
                if (searchNum == array[i]){
                    ifFound = true;
//                    System.out.println("Found");
                    System.out.println("The number was found at index:"+i);
                } else {
                    System.out.println("Not Found");
                }
            }
        } else {
            System.out.println("ERROR!");
            System.out.println(searchNum+" is not in the scope.");
        }
    }

}

// TODO:
//        > clean up as much as possible
//        > try to exclude 0 from the Randomized Array
//        > find a way to space out the sorted array --> COMPLETE
//        > FINISH TASK:: Display each number from 1 to 100 and the number of times each is found in the array.

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


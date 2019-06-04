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

public class HwFive {
    public static void main(String[] args) {
//        System.out.println("blessed in the name of JESUS, the name above all names.");

        int max=100;
        int min=1;
        int range = max - min +1;

        double[] myArray = new double[100];


        for (int i=1; i< myArray.length; i++) {
            myArray[i] = (Math.random() * range) + min;
            System.out.printf("%.0f\n", myArray[i]);
        }

// Average in MAIN:
        double result;
        result = calculateAverage(myArray);

        System.out.println("The average is: " +result);
    }

// METHOD: calculate the average.
    static double calculateAverage(double[] array) {
        double average=0.0, sum=0.0;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        return average;
    }

////METHOD: sort the array.
//    static
}

//TODO:
//        Program Specifications:
//        Write a program that does the following:
// ..
//        Create an array of 100 integers.
//        Store 100 random integers (between 1 and 100) in the array.
//        Print out the elements of the array.
//        Sort the array in ascending order.
//        Print out the sorted array.
//        Prompt the user to enter a number between 1 and 100. Search the array for that number and then display  "Found" or "Not Found" message.
//        Display each number from 1 to 100 and the number of times each is found in the array.
//        Display the average of the numbers in the array.
//        Display the highest number in the array.
//        Display the lowest number in the array.
// ..
//        Other requirements.
// ..
//        Everything should be done using METHODS.
//        NO NEED FOR A MENU SYSTEM. Just call the methods in the sequence above.
//        Add your design tool to your project.


///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            HW2 Basic IO Program
// Semester:         (cop2800c) Summer 2019
//
// Author:           Dominic Heningburg
// Date:             5/19/2019
//
//////////////////// ``````````````````````````````````` ////////////////////

package com.valencia.professor.macon.modules.hw2_basic_IO_program;

import java.util.Scanner;

public class HwTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("to the CREATOR all glory and honor!");

//  CALLING CONSTRUCTOR:
    GetNumbers getNumbers = new GetNumbers();

//  REQUESTING INPUT:
        System.out.println("Enter First Number: ");
        getNumbers.setNum1(scanner.nextInt());

        System.out.println("Enter Second Number: ");
        getNumbers.setNum2(scanner.nextInt());

        System.out.println("Enter Third Number: ");
        getNumbers.setNum3(scanner.nextInt());

//  OUTPUTTING INPUT:
    System.out.println("The three numbers are: "+getNumbers.getNum1()+" "+ getNumbers.getNum2()+" "+getNumbers.getNum3());

//  CALLING FUNCTIONS:
     getNumbers.solveSum();
     getNumbers.solveAverage();

//  SIMPLE WAY:
//        int num1, num2, num3;
//        System.out.println("Enter First Number: ");
//        num1 = scanner.nextInt();
//        System.out.println("Enter Second Number: ");
//        num2 = scanner.nextInt();
//        System.out.println("Enter Third Number: ");
//        num3 = scanner.nextInt();
//        int answer = num1 + num2 + num3;
//        double average = answer / 3;
//        System.out.println(answer);
//        System.out.println(average);
    }
}

//TODO:
// Basic Input and Output Program
// ..
// Outcomes:
// ..
// Student will demonstrate the ability to understand primitive data types.
// Student will demonstrate the ability to understand arithmetic operators.
// Student will demonstrate the ability to understand and use variables.
// Student will demonstrate the ability to create and user a Scanner for input.
// Student will demonstrate the ability to use System.out.println().
// Student will demonstrate the ability to use the “+” to concatenate strings together.
// Student will demonstrate the ability to create and use a design tool.
// ..
// Program Specifications:
// ..
// This program requires the student to create a short and simple design tool and program that asks the user for
// three numbers. The output will be the sum and average of the three numbers.
// ..
// Sample output (your output should look just like this for the same input):
// ..
// The three numbers are: 99, 99, and 99.
// ..
// The sum of the numbers is: 297
// ..
// The average of the numbers is: 99.00

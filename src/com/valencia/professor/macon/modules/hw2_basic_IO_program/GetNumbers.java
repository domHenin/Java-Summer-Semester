package com.valencia.professor.macon.modules.hw2_basic_IO_program;

import java.util.Scanner;

public class GetNumbers {
    private int num1;
    private int num2;
    private int num3;
    private int sum=0;


//  SETTERS:
    public void setNum1(int num1) { this.num1 = num1; }
    public void setNum2(int num2) { this.num2 = num2; }
    public void setNum3(int num3) { this.num3 = num3; }
    public void setSum(int sum)   { this.sum = sum;   }

//  GETTERS:
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
    public int getNum3() { return num3; }
    public int getSum()  { return sum;  }

//  SOLVE SUM:
    public int solveSum() {
        sum = getNum1() + getNum2() + getNum3();

        System.out.println("The sum of the numbers is: "+sum);
        return sum;
    }

//  SOLVE AVERAGE:
    public double solveAverage() {
        double avg = sum / 3;

        System.out.printf("The average of the numbers is: %.2f", avg);
        return avg;
    }
}

package com.valencia.professor.macon.modules.hw2_basic_IO_program;

public class SolveFor extends GetNumbers{
    private int ans;

    public SolveFor(int num1, int num2, int num3, int ans) {
        super(num1, num2, num3);
        this.ans = ans;
    }

    public void setAns(int ans) { this.ans = ans; }

    public int getAns() { return ans; }

    public int getSum() {
        ans = getNum1() + getNum2() + getNum3();

        System.out.println("Answer for Sum: "+ans);
        return ans;
    }

    public double getAverage() {
        double avg = ans / 3;

        System.out.println("Answer for Average: "+avg);
        return avg;
    }
}

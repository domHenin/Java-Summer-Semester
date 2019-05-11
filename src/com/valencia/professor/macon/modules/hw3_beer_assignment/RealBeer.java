package com.valencia.professor.macon.modules.hw3_beer_assignment;

public class RealBeer {

    public static final int YEAR = 365;
    public static final int CALORIE = 150;
    public static final int ONCE = 12;
    public static final int POUND = 3650;

    private double dailyBeer=0;
    private double paymentBeer=0;
    private double yearlyAns=0;
    private double calorieIntake=0;

//SETTERS
    public void setDailyBeer(double dailyBeer) { this.dailyBeer = dailyBeer; }

    public void setPaymentBeer(double paymentBeer) { this.paymentBeer = paymentBeer; }

    public void setYearlyAns(double yearlyAns) { this.yearlyAns = yearlyAns; }

    public void setCalorieIntake(double calorieIntake) { this.calorieIntake = calorieIntake; }


//GETTERS
    public double getDailyBeer() { return dailyBeer; }

    public double getPaymentBeer() { return paymentBeer; }

    public double getYearlyAns() { return yearlyAns; }

    public double getCalorieIntake() { return calorieIntake; }

    public double yearlyConsumeSolve() {
        yearlyAns = dailyBeer * YEAR;

        System.out.printf("That is approximately %.2f beers in one year.\n", yearlyAns);
        return yearlyAns;
    }

    public double yearlyCaloriesSolve() {
        calorieIntake = yearlyAns * CALORIE;

        System.out.printf("In one year, you will consume approximately %.2f calories from beer alone.\n", calorieIntake);
        return calorieIntake;
    }

    public double weightGainSolve() {
        double gainedWeight = calorieIntake / POUND;

        System.out.printf("Without diet or exercise to counter these calories, you can expect to gain %.2f pounds from drinking that much beer this year.\n", gainedWeight);
        return gainedWeight;
    }
}

// FORMULA: yearlyAns * CALORIE
// FORMULA: beerConsume * 365(year)
// FORMULA: calorieIntake / 3650
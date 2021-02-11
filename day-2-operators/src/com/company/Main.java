package com.company;

public class Main {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (meal_cost / 100) * tip_percent;
        double tax = (meal_cost / 100 ) * tax_percent;
        double cost = Math.round(meal_cost + tip + tax);
        System.out.printf("%.0f",cost);
    }

    public static void main(String[] args) {

        solve(12.00, 20, 8);
        

    }
}

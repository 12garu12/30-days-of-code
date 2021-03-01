package com.company;

interface AdvancedArithmetic{

    public int divisorSum(int n);

}

class Calculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int divisorSum = 0;

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                divisorSum += i;
            }
        }

        return divisorSum;
    }
}

public class Solution {

    public static void main(String[] args) {
	// write your code here

        Calculator obj = new Calculator();

        System.out.println(obj.divisorSum(20));

    }
}

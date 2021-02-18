package com.company;

public class Solution {

    static int factorial(int n) {
        int result;
        if(n == 1){
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }


    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(6));

    }
}

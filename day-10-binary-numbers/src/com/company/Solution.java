package com.company;

import java.util.Scanner;

public class Solution {

    static int countBinary(int n){
        String numBinary = Integer.toBinaryString(n);
        int maxOnes = 0, ones = 0;
        for (int i = 0; i < numBinary.length() ; i++) {
            if (numBinary.charAt(i) == '1')ones++;
            else ones = 0;
            if (ones > maxOnes) maxOnes = ones;
        }
        return maxOnes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(countBinary(n));

        scanner.close();




    }
}

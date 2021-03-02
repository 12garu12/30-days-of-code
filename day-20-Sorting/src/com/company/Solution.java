package com.company;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1 ; j++) {
                if (a[j] > a[j + 1]) {
                    int previousItem = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = previousItem;
                    numberOfSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps  + " swaps." +
                           "\nFirst Element: " + a[0] +
                           "\nLast Element: " + a[n - 1]);
    }
}

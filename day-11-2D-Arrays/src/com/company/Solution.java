package com.company;

import java.util.Scanner;

public class Solution {

    public static int sumHourGlass(int[][] arr){

        int sum = 0, maxHourGlassSum = -350;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                           + arr[i + 1][j + 1 ] +
                      arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > maxHourGlassSum){
                    maxHourGlassSum = sum;
                }
            }
        }
        return maxHourGlassSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(sumHourGlass(arr));

        scanner.close();

    }
}

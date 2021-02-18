package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        String aray = "";
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            aray += arr[i] + " ";
        }
        aray = aray.substring(0, aray.length() - 1);
        System.out.println(aray);

        scanner.close();

    }
}
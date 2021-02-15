package com.company;

import java.util.Scanner;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int T = sc.nextInt();
        sc.nextLine();
        String str = "";

        for (int i = 0; i < T; i++) {
            str += sc.nextLine() + " ";
        }
        str = str.substring(0, str.length()-1);
        String[] strs = str.split(" ");
        String str2;

        for (int i = 0; i < strs.length ; i++) {
            String evenString = "", oddString = "";
            str2 = strs[i];
            for (int j = 0; j < str2.length() ; j++) {
                if ( j == 0 || j % 2 == 0){
                    evenString += str2.charAt(j);
                }else oddString += str2.charAt(j);
            }
            System.out.println(evenString + " " + oddString);

        }

        sc.close();

    }
}

package com.company;

import java.util.Scanner;

public class Solution {



    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            Integer itg = Integer.parseInt(S);
            System.out.println(itg);
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }

}

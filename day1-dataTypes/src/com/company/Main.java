package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 3;
        double d = 2.8;
        String s = "HackerRank";
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        System.out.println(i + a);
        System.out.printf("%.1f", d + b);
        System.out.println();
        System.out.println(s + c);

        scan.close();


    }
}

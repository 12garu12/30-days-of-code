package com.company;

import java.util.*;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }

    public int computeDifference() {
        int minimum = Arrays.stream(elements).min().getAsInt();
        int maximum = Arrays.stream(elements).max().getAsInt();
        maximumDifference = Math.abs(maximum - minimum);
        return maximumDifference;
    }

}

class Solution{


    public static void main(String[] args) {
	// write your code here

    }
}

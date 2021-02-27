package com.company;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    private Stack<Character> stack;
    LinkedList queuey;

    public Solution(){
        stack = new Stack<>();
        queuey = new LinkedList();
    }

    public void pushCharacter(char c){
        stack.push(c);
    }

    public void enqueueCharacter(char c){
        queuey.addLast(c);
    }

    public char popCharacter(){
        return stack.pop();
    }

    public char dequeueCharacter(){
        return (char) queuey.remove(0);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();


        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

    }
}

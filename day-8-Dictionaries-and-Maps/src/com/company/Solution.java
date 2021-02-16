package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
	// write your code here

        Map<String, Object> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            String phone;
            try {
                 phone = phoneBook.get(s).toString();
            }catch (NullPointerException e){
                phone = null;
            }
            if (phone != null){
                System.out.println(s.concat("=").concat(phone));
            }else System.out.println("Not found");
        }
        in.close();


    }
}

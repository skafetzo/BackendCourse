package com.hackerrank.data.structures;


import java.util.*;

/*Solves the HashSet problem of Data Structures */


public class SolutionSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        if (t >= 1 && t <= 10000) {
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];
            Set<String> mySet = new HashSet();

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
                if (checkString(pair_left[i]) && checkString(pair_right[i]) && (pair_left[i] + pair_right[i]).length() > 5) {
                    mySet.add(pair_left[i] + " " + pair_right[i]);
                    System.out.println(mySet.size());
                }
            }

        }

        s.close();
    }

    private static boolean checkString(String str) {
        char ch;

        boolean lowerCaseFlag = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                lowerCaseFlag = false;

            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
        }
        return lowerCaseFlag;
    }
}

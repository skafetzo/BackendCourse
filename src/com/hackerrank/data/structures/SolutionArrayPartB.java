package com.hackerrank.data.structures;

import java.util.*;

/*Solves the 1D Array part 2  problem of Data Structures */

public class SolutionArrayPartB {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }


    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean result = false;
        for (int i = 0; i < game.length; i++) {

            if (i + leap >= game.length) {
                return true;
            }

            if (game[i + 1] == 1) {
                if (game[i + leap] == 1) {
                    return false;
                } else {
                    i += leap;
                }
            } else {
                result = true;
            }
        }
        return result;
    }
}


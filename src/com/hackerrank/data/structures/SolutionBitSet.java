package com.hackerrank.data.structures;

/*Solves the Bit Set  problem of Data Structures */

import java.util.BitSet;
import java.util.Scanner;

public class SolutionBitSet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = scan.next();
            int k = scan.nextInt();
            int l = scan.nextInt();

            if (operation.equals("AND")) {
                if (k == 1) {
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
            } else if (operation.equals("SET")) {
                if (k == 1) {
                    b1.set(l);
                } else {
                    b2.set(l);
                }
            } else if (operation.equals("FLIP")) {
                if (k == 1) {
                    b1.flip(l);
                } else {
                    b2.flip(l);
                }
            } else if (operation.equals("OR")) {
                if (k == 1) {
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
            } else if (operation.equals("XOR")) {
                if (k == 1) {
                    b1.xor(b2);
                } else {
                    b2.xor(b1);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scan.close();
    }
}

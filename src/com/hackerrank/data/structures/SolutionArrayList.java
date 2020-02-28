package com.hackerrank.data.structures;

import java.util.*;

public class SolutionArrayList {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 20000) {
            ArrayList[] mylist = new ArrayList[n];

            for (int i = 0; i < n; i++) {
                mylist[i] = new ArrayList();
                int d = sc.nextInt();
                if (d >= 1 && d <= 50000) {
                    for (int j = 0; j < d; j++) {
                        mylist[i].add(sc.nextInt());
                    }
                }
            }


            int q = sc.nextInt();
            if (q >= 1 && q <= 1000) {
                for (int i = 0; i < q; i++) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    try {
                        System.out.println(mylist[x - 1].get(y - 1));
                    } catch (Exception e) {
                        System.out.println("ERROR!");
                    }
                }

            }

            sc.close();

        }
    }

}





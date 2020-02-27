package com.hackerrank.data.structures;

import java.io.*;
import java.util.*;

public class SolutionArrayList {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            List mylist = new ArrayList();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int j=1; j <= n; j++)
            for (int i=0;i<m;i++){
               int  q = sc.nextInt();
                mylist.add(q);
            }
            sc.close();
        }
    }



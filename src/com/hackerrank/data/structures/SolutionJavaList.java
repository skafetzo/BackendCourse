package com.hackerrank.data.structures;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionJavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        List myList = new ArrayList();
        List queryList = new ArrayList();


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n>=1 && n<=4000) {
            for (int i = 0; i < n; i++) {

                myList.add(scan.next());
            }
        }


        int q = scan.nextInt();
        if(q >=1 && q <= 4000 ) {
            for (int i = 0; i < q; i++) {
                String query = scan.next().toString();
                if (query.equals("Insert")) {
                    int index = scan.nextInt();
                    int value = scan.nextInt();
                    myList.add(index, value);
                } else { // "Delete"
                    int index = scan.nextInt();
                    myList.remove(index);
                }
            }
        }

        scan.close();

        for (int i=0; i<myList.size(); i++){

            System.out.print(myList.get(i) + " ");
        }

    }


}




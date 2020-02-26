package com.hackerrank.object.oriented.programming;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] a = new int[2];
        a[0] = 1;
        a[1] = -2;
   //     a[2]= 4;
     //   a[3] = -5;
      //  a[4] = 1;


//        for (int i = 0; i < n; i++) {
//
//            a[i] = sc.nextInt();
//        }
//
//        sc.close();

        printSubArrays(a, 0, 0);
    }

        static void printSubArrays ( int[] arr, int start, int end){

        int sum = 0;
            // Stop if we have reached the end of the array
            if (end == arr.length) {
                return;
            }// Increment the end point and start from 0
            else if (start > end) {
                printSubArrays(arr, 0, end + 1);
            }// Print the subarray and increment the starting point
            else {
                System.out.print("[");
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i] + ", ");
                     sum = sum + arr[i];
                    System.out.println("sum:" + sum);
                }

                System.out.println(arr[end] + "]");
                System.out.println("Sum: " + sum);
                printSubArrays(arr, start + 1, end);
            }

            return;
        }


    }



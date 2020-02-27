package com.hackerrank.data.structures;

import java.io.*;
import java.util.*;

/*Solves the Subarray problem of Data Structures */

    public class SolutionSubarry {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int a[] = new int[n];
            int count=0;
            int i,j,sum = 0;
            for(i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
            scan.close();
            for(i=0;i<n;i++)
            {
                sum = 0;
                for(j=i;j<n;j++)
                {
                    sum = a[j] + sum;
                    if(sum<0){
                        count++;
                    }
                }
            }
            System.out.println(count);


        }
    }



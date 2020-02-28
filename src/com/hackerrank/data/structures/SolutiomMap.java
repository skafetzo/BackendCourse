package com.hackerrank.data.structures;

import java.util.*;

/*Solves the Map problem of Data Structures */

    class SolutiomMap {

        public static void main(String []args){

            Map phoneBook = new HashMap();

            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            in.nextLine();
            for(int i=0;i<n;i++)
            {
                String name=in.nextLine();
                int phone=in.nextInt();
                int length = String.valueOf(phone).length();
                if(length == 8 && checkString(name)) {
                 phoneBook.put(name, phone);
                }
                in.nextLine();
            }
            while(in.hasNext())
            {
                String s=in.nextLine();
                if(phoneBook.containsKey(s)) {
                    System.out.println(s + "=" + phoneBook.get(s));
                }else {
                    System.out.println("Not found");

                }
            }
            in.close();
        }

        private static boolean checkString(String str) {
            char ch;
          //  boolean capitalFlag = false;
            boolean lowerCaseFlag = false;

            for(int i=0;i < str.length();i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    return false;

                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }
            }
            return lowerCaseFlag;
        }
    }






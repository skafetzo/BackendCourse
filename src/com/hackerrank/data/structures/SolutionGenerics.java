package com.hackerrank.data.structures;

import java.lang.reflect.Method;

/*Solves the Generics problem of Data Structures */

    public class SolutionGenerics {


        public static void main( String args[] ) {
            Printer myPrinter = new Printer();
            Integer[] intArray = { 1, 2, 3 };
            String[] stringArray = {"Hello", "World"};
            myPrinter.printArray(intArray);
            myPrinter.printArray(stringArray);
            int count = 0;

            for (Method method : Printer.class.getDeclaredMethods()) {
                String name = method.getName();

                if(name.equals("printArray"))
                    count++;
            }

            if(count > 1)System.out.println("Method overloading is not allowed!");

        }


      static   class Printer{

            //Write your code here
            private int length;
            private Object[] myArray;


            public Printer(){
                myArray = new Object[length];
            }

            void printArray(Object[] myArray){

                for(int i=0; i<myArray.length; i++){
                    System.out.println(myArray[i]);
                }
            }

        }
    }


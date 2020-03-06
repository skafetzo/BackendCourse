package gr.cosmote.thirdexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 0;
        int aliquotSum = 0;
        ArrayList<Integer> divisors = new ArrayList<>();

        try {
            System.out.println(" Enter a positive number to check whether it is perfect.");
            n = scan.nextInt();
            if (n <= 0 ){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Your input is not valid. Please enter a positive number!");
            n = scan.nextInt();
        }

        if (isPrime(n)) {
                System.out.println("The number " + n + " is " + Number.DEFICIENT);
            } else {
                divisors = findDivisors(n);

                for (Integer div : divisors) {
                    aliquotSum += div;
                }
                if (aliquotSum > n) {
                    System.out.println("The number " + n + " is " + Number.ABUNDANT);
                } else if ( aliquotSum < n) {
                    System.out.println("The number " + n + " is " + Number.DEFICIENT);
                } else {
                    System.out.println("The number " + n + " is " + Number.PERFECT);
                }
            }

        scan.close();

    }

    /**
     * Method to find the divisors of an int. Method excludes the division by itself
     *
     * @param number the int to find the divisors or
     * @return divisors array list of integers
     */
    private static ArrayList<Integer> findDivisors(int number) {

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /**
     * Method to check if a number is prime
     *
     * @param number
     * @return boolean if is prime
     */
    private static boolean isPrime(int number) {
        for (int div = 2; div <= number - 1; div++) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }
}

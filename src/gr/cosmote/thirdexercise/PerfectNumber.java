package gr.cosmote.thirdexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int aliquotSum = 0;

        ArrayList<Integer> divisors = new ArrayList<>();


        divisors = findDivisors(n);

        for (Integer div : divisors) {
            aliquotSum += div;
        }

        if (aliquotSum > n) {
            System.out.println(Number.ABUNDANT);
        } else if (isPrime(n) | aliquotSum < n) {
            System.out.println(Number.DEFICIENT);
        } else {
            System.out.println(Number.PERFECT);
        }
        System.out.println(divisors);
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

package gr.cosmote.firstexercise;


public class Calculator {


    public Calculator() {

    }

    /**
     * Method to add 2 numbers
     *
     * @param int1
     * @param int2
     * @return the sum
     */
    public int addTwoNumbers(int int1, int int2) {

        return int1 + int2;

    }

    /**
     * Method to subtract two numbers
     *
     * @param int1
     * @param int2
     * @return the difference
     */
    public int subtractTwoNumbers(int int1, int int2) {

        return int1 - int2;
    }

    /**
     * Method to multiply two numbers
     *
     * @param int1
     * @param int2
     * @return the product
     */
    public int multiplyTwoNumbers(int int1, int int2) {

        return int1 * int2;
    }

    /**
     * Method to divide two numbers
     *
     * @param int1
     * @param int2
     * @return the quotient
     */
    public int divideTwoNumbers(int int1, int int2) {

        return int1 / int2;
    }

    /**
     * Method to calculate the power given a base and an exponent
     *
     * @param int1 the base
     * @param int2 the exponent
     * @return the power
     */
    public int expTwoNumbers(int int1, int int2) {
        long product = 1;
        for (int i = 1; i <= int2; i++) {
            product *= int1;
        }
        return (int) product;
    }

    /**
     * Method to calculate and print the verbal expression of the division
     *
     * @param int1
     * @param int2
     * @return String the verbal expression of the division
     */
    public String printDivision(int int1, int int2) {

        int quotient = divideTwoNumbers(int1, int2);
        int modulo = int1 % int2;
        String expression = int1 + " = " + quotient + " * " + int2 + " + " + modulo;
        return expression;
    }

    /**
     * Method to calculate the prime factorization
     *
     * @param number
     * @return String analyzing the result
     */
    public String productOfPrimes(int number) {

        String result = "" + number + " = ";
        if (isPrime(number)) {
            return result + number;
        } else {
            int tempNumber = number;
            for (int i = 2; i <= tempNumber; i++) {
                if (isPrime(i)) {
                    while (tempNumber % i == 0) {
                        tempNumber = tempNumber / i;
                        if (tempNumber != 1) {
                            result = result + i + " * ";
                        } else {
                            result = result + i;
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * Method to check if a number is prime
     *
     * @param number
     * @return boolean if is prime
     */
    private boolean isPrime(int number) {
        for (int div = 2; div <= number - 1; div++) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }


}




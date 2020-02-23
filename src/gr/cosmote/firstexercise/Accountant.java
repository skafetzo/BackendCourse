package gr.cosmote.firstexercise;

public class Accountant {

    private Calculator calculator;
    private double cost;
    private static int counter;
    private String name;


    public Accountant(String name, Calculator calculator) {
        this.calculator = calculator;
        this.name = name;
    }

    /**
     * Method to calculate the operation with thw arguments
     *
     * @param operation the mathematical operation
     * @param int1
     * @param int2
     */

    public void calculate(String operation, int int1, int int2) {

        if (validateCalculatorInput(int1) && validateCalculatorInput(int2)) {

            switch (operation) {

                case "sum":
                    int sum = calculator.addTwoNumbers(int1, int2);
                    System.out.println("The result of " + int1 + " + " + int2 + " is " + sum);
                    cost += 1;
                    counter++;
                    break;

                case "subtraction":
                    int subtract = calculator.subtractTwoNumbers(int1, int2);
                    System.out.println("The result of " + int1 + " - " + int2 + " is " + subtract);
                    cost += 1;
                    counter++;
                    break;

                case "product":
                    int product = calculator.multiplyTwoNumbers(int1, int2);
                    System.out.println("The result of " + int1 + " * " + int2 + " is " + product);
                    cost += 1;
                    counter++;
                    break;

                case "division":
                    int quotient = calculator.divideTwoNumbers(int1, int2);
                    System.out.println("The result of " + int1 + " / " + int2 + " is " + quotient);
                    cost += 1;
                    counter++;
                    break;

                case "showDivision":
                    String print = calculator.printDivision(int1, int2);
                    System.out.println("The result of " + int1 + " / " + int2 + " is " + print);
                    cost += 2;
                    counter++;
                    break;

                case "exponent":
                    int exp = calculator.expTwoNumbers(int1, int2);
                    System.out.println("The result of " + int1 + " ^ " + int2 + " is " + exp);
                    cost += 2;
                    counter++;
                    break;

                default:
                    System.out.println("Unsupported operation");
            }

        } else {
            System.out.println("The integer provided is not in the accepted range");
            cost += 0.5;
        }

    }


    /**
     * Method to calculate the operation with only one argument
     *
     * @param operation the mathematical operation
     * @param int1
     */
    public void calculate(String operation, int int1) {

        if (operation.equals("productOfPrimes")) {
            if (validateCalculatorInput(int1)) {
                String primeFactorization = calculator.productOfPrimes(int1);
                System.out.println("The primeFactorization of " + int1 + " is " + primeFactorization);
                cost += 2;
                counter++;
            }
        } else {
            System.out.println("Unsupported operation");
        }
    }

    /**
     * Method to print the cost amount of mathematical operations
     * sets the cost to zero after printing
     */
    public void showAmountOfCredit() {

        System.out.println("The total credits of operations for " + this.name + " is : " + this.getCost());
        setCost(0);
    }

    /**
     * Method to check if an input is valid, i.e. between 1 an 100
     *
     * @param int1
     * @return boolean if is valid
     */
    private boolean validateCalculatorInput(int int1) {
        if (int1 < 1 | int1 > 100) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Method to calculate the total number of operation of the Accountant class
     *
     * @return
     */
    public static int getTotalNumberOfOperations() {
        System.out.println("The total amount of operations for the class Accountant is : " + counter);
        return counter;
    }


    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


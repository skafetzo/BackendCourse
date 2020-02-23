package gr.cosmote.firstexercise;

public class Customer {

    public static void main(String args[]) {


        Accountant george = new Accountant("George", new Calculator());
        Accountant nick = new Accountant("Nick", new Calculator());


        george.calculate("sum", 52, 45);
        george.calculate("subtraction", 15, 5);
        george.calculate("product", 5, 2);
        george.calculate("division", 10, 3);
        george.calculate("showDivision", 10, 3);
        george.calculate("exponent", 2, 4);
        george.calculate("productOfPrimes", 95);
        george.calculate("Sum", 5, 6);
        george.calculate("product", 5, 106);
        george.showAmountOfCredit();
        george.calculate("showDivision", 10, 3);
        george.showAmountOfCredit();


        nick.calculate("sum", 14, 45);
        nick.calculate("subtraction", 20, 5);
        nick.calculate("product", 63, 2);
        nick.calculate("division", 42, 5);
        nick.calculate("showDivision", 42, 5);
        nick.calculate("exponent", 5, 4);
        nick.calculate("productOfPrimes", 63);
        nick.calculate("Not valid", 5, 6);
        nick.calculate("productOfPrimes", 0);
        nick.calculate("showDivision", 124, -1);
        nick.showAmountOfCredit();


        Accountant.getTotalNumberOfOperations();

    }


}

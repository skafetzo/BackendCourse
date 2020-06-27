package gr.cosmote.fourthexercise;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Task implements Runnable {

    private int start;
    private int finish;
    private ConcurrentHashMap hashMap;

    public Task(int start, int finish, ConcurrentHashMap v) {

        this.start = start;
        this.finish = finish;
        this.hashMap = v;
    }

    @Override
    public void run() {

     FoundNum foundNum = maximumNumOfDivisors(start, finish);
     hashMap.put(foundNum.getNum(),foundNum.getNumOfDivisors());

    }


    private int numOfDivisors(int number) {
        int divisorsSum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
            {
                divisorsSum++;
            }
        }
        return divisorsSum;
    }

    private  FoundNum maximumNumOfDivisors(int startingNumber, int endingNumber) {
        int maxDivisors = 0;
        int numFound = startingNumber;
        for (int i = startingNumber; i <= endingNumber; i++) {
            if (numOfDivisors(i) > maxDivisors)
            {
                maxDivisors = numOfDivisors(i);
                numFound = i;
            }
        }
        FoundNum result = new FoundNum(numFound, maxDivisors);
        return result;
    }
}

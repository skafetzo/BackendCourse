package gr.cosmote.fourthexercise;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*Second approach used Callable which is, in my opinion, a more suitable
solution when you want to handle a return value */


public class SecondApproach {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Callable<FoundNum>> callableTasks = new ArrayList<>();

        System.out.println("Starting execution with multiple threads");
        Instant start = Instant.now();

        for(int i = 1; i < 100000; i+=10000){
            final int j = i;
            Callable<FoundNum> task = () -> {
                FoundNum foundNum = maximumNumOfDivisors(j, j + 10000);
                return foundNum;
                  };
        callableTasks.add(task);
        }


        System.out.println(new Timestamp(System.currentTimeMillis()));
        List<Future<FoundNum>> futures = executor.invokeAll(callableTasks);



        int numFound = 0;
        int maxDivisorsFound = 0;

        for (Future<FoundNum> future : futures) {
            if (future.get().getNumOfDivisors() > maxDivisorsFound) {
                maxDivisorsFound = future.get().getNumOfDivisors();
                numFound = future.get().getNum();
            }
        }

        executor.shutdown();

        System.out.println("The number is: " + numFound);
        System.out.println("The maximum divisors number is: " + maxDivisorsFound);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Finished execution with multiple threads");
        System.out.println("Time Elapsed " + timeElapsed);

    }

    private static int numOfDivisors(int number) {
        int divisorsSum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
            {
                divisorsSum++;
            }
        }
        return divisorsSum;
    }

    private static FoundNum maximumNumOfDivisors(int startingNumber, int endingNumber) {
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

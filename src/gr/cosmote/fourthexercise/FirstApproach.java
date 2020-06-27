package gr.cosmote.fourthexercise;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;

/*Write a program that uses multiple threads to find the integer
in a range that has the largest number of divisors.
The range is from 1 to 100000.
By using threads, your program will take less time to do the computation when it is run on a multiprocessor computer.
At the end of the program, output the elapsed time, the integer that has the largest number of divisors,
and the number of divisors that it has.*/

public class FirstApproach {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, Integer> concurrentResults = new ConcurrentHashMap();
        System.out.println("Starting execution with multiple threads");
        Instant start = Instant.now();

        for(int i = 1; i < 100000; i+=10000){
            Runnable task = new Task (i,i+10000, concurrentResults);
            task.run();
        }

        Integer maxKey = Collections.max(concurrentResults.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        Integer maxValue = concurrentResults.get(maxKey);
        System.out.println("The number is: " + maxKey);
        System.out.println("The maximum divisors number is: " + maxValue);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Finished execution with multiple threads");
        System.out.println("Time Elapsed " + timeElapsed);


    }
}

package org.ron.c130.exercises;

import java.text.MessageFormat;
import java.util.Scanner;

public class HealthyHearts {

    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;

    private static final int TIE = 0;
    private static final int COMPUTER = 1;
    private static final int USER = 1;

    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int age;
        while (true) {
            try {
                age = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Invalid age, please try again.");
            }
        }

        int maxHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");

        double heartRateUpperBound = 0.85 * maxHeartRate;
        double heartRateLowerBound = 0.50 * maxHeartRate;

        String result = MessageFormat.format("Your target HR zone is {0} - {1} beats  per minute", heartRateLowerBound, heartRateUpperBound);
        System.out.println(result);

//        System.out.println(String.format("Your target HR zone is %1d - %2d beats  per minute", heartRateLowerBound, heartRateUpperBound));
        System.out.printf("Your target HR zone is %1$.2f - %2$.2f beats  per minute%n", heartRateLowerBound, heartRateUpperBound);

        System.out.println("Your target HR Zone is " + heartRateLowerBound + " - " + heartRateUpperBound + " beats per minute");
    }
}
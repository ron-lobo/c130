package org.ron.c130.intro;

import java.util.Random;

public class Loops {

    private static Random random = new Random();

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();
    }

    private static void doWhileLoop() {
        System.out.println("\nBasic do-while loop");
        do {
            System.out.println("hi");
        } while (random.nextBoolean());
    }

    private static void whileLoop() {

        System.out.println("\nBasic while loop");
        int i = 0;
        while (i < 5) {
            System.out.println("i=" + i);
            i++;
        }

        System.out.println("\nwhile loop with random condition");
        while (random.nextInt(100) < 66) {
            System.out.println("looping ...");
        }

        System.out.println("\nwhile loop with break and continue");
        while (true) {
            System.out.println("hi");
            if (random.nextInt(100) % 3 == 0) {
                continue;
            }
            System.out.println("howdy");
            if (random.nextInt(100) % 2 == 1) {
                break;
            }
            System.out.println("bye");
        }
    }

    private static void forLoop() {

        System.out.println("\nBasic for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }

        String s = "C130";

        System.out.println("\nfor loop (string)");
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i=" + i + ", c=" + s.charAt(i));
        }

        System.out.println("\nenhanced for loop (string)");
        char[] chars = s.toCharArray();
        for (char c : chars) {
            System.out.println("c=" + c);
        }

        System.out.println("\nenhanced for loop (int array)");
        int[] values = new int[]{66, 55, 22, 33};
        for (int i : values) {
            System.out.println("i=" + i);
        }
    }
}

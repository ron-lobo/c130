package org.ron.c130.intro;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();

        System.out.println("Please enter temp in Fahrenheit: ");
        double tempInF = myScanner.nextDouble();

        double tempInC = (tempInF - 32.0) * 5.0 / 9.0;

        System.out.println("temp = " + tempInC + "C");
        System.out.println("thanks " + userName);
    }
}

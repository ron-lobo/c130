package org.ron.c130.intro;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();

        System.out.println("1. Convert C->F");
        System.out.println("2. Convert F->C");
        String temp0, temp1;
        int choice = myScanner.nextInt();
        if (choice == 1) {
            temp0 = "C";
            temp1 = "F";
        } else {
            temp0 = "F";
            temp1 = "C";
        }

        System.out.println("Please enter temp in " + temp0 + ": ");
        double temp0Value = myScanner.nextDouble();

        double temp1Value;
        if (choice == 1) {
            temp1Value = temp0Value * 9 / 5 + 32.0;
        } else {
            temp1Value = (temp0Value - 32.0) * 5.0 / 9.0;
        }

        System.out.println("temp = " + temp1Value + temp1);
        System.out.println("thanks " + userName);
    }
}

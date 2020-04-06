package com.acejones;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        countingMachine();
        countingMachine2();
        countingByHalves();
    }

    public static void countingMachine() {
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Counting to: " + number);
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countingMachine2() {
        System.out.println("Count from: ");
        int numFrom = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Count to: ");
        int numTo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Count by: ");
        int numBy = scanner.nextInt();
        scanner.nextLine();

        for (int i = numFrom; i <= numTo; i += numBy) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countingByHalves(){
        System.out.println("Counting by halves from -10.0 -> 10.0 \n" +
                "=========================================");
        for (double x = -10.0; x <= 10.0; x+=0.5 ) {
            System.out.println(x);
        }
        System.out.println();
    }
}

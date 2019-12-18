package org.fasttrackit;

import java.util.Scanner;

public class exercitiul3 {

    public static void main(String[] args) {

        int n, t;
        int oddSum = 0, evenSum = 0;

        System.out.println("How many times do you want to play!");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        if( t >= 1 && t <= 200) {
            for (int i = 0; i < t; i++) {
                System.out.println("Enter N");
                Scanner scanner1 = new Scanner(System.in);
                n = scanner1.nextInt();
                if ( n >= 1 && n <= 10000) {
                    for (int j = 0; j <= n; j++) {

                        if (j % 2 == 0) {
                            evenSum += j;
                        } else
                            oddSum += j;
                    }
                    System.out.println(evenSum + " " + oddSum);
                    evenSum = 0;
                    oddSum = 0;
                }else
                    System.out.println("Enter a number betwen 1 and 10000");
            }
        }else
            System.out.println("Enter a number betwen 1 and 200");
    }
}

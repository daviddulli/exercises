package org.fasttrackit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercitiul4 {
    public static void main(String[] args) {
        int n, t;
        List<Integer> A = new ArrayList<>();
        System.out.println("How many times do you want to play?");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        if (t >= 1 && t <= 100) {

            for (int i = 0; i < t; i++) {

                System.out.println("Enter your array's length");
                Scanner scanner1 = new Scanner(System.in);
                n = scanner1.nextInt();
                if (n >= 1 && n <= 100) {
                    for (int j = 0; j < n; j++) {
                        int value;
                        Scanner scanner2 = new Scanner(System.in);
                        value = scanner2.nextInt();
                        if (value >= 0 && value <= 10000) {
                            A.add(value);
                        } else
                            System.out.println("Enter a value betwen 0 - 10000");
                    }
                    int x;
                    for (int k = 0; k < n - 1; k++) {

                        if (A.get(k) < A.get(k + 1)) {
                            Collections.swap(A, k, k + 1);
                            for (int m = n - 1; m > 1; m--)
                                if (A.get(m) < A.get(m + 1)) {
                                    Collections.swap(A, m, m + 1);
                                }
                        }
                    }

                    for (int l = 0; l < n; l++) {
                        System.out.print(A.get(l) + " ");
                    }


                } else
                    System.out.println("Enter a number betwen 1 - 100");

            }
        } else
            System.out.println("Enter a number betwen 1 -100");
    }
}

package org.fasttrackit;

import javax.swing.*;
import java.util.*;

public class exercitiul2 {

    public static void main(String[] args) {
        int t, q = 0;
        ArrayList arrayListA = new ArrayList();
        System.out.println("How many times do you want to play? ");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        if (t >= 1 && t <= 100) {
            for (int i = 0; i < t; i++) {
                try {
                    System.out.println("How many queries do you want?");
                    Scanner scanner1 = new Scanner(System.in);
                    q = scanner1.nextInt();


                } catch (InputMismatchException e) {
                    System.out.println("Enter a numeric value...");
                }
                if (q >= 1 && q <= 100) {
                    for (int j = 0; j < q; j++) {

                        try {
                            System.out.println("Chose your query!");
                            Scanner scanner2 = new Scanner(System.in);
                            String query = scanner2.nextLine();
                            switch (query) {
                                case "a":
                                    Scanner scanner3 = new Scanner(System.in);
                                    arrayListA.add(scanner3.nextInt());
                                    break;
                                case "b":
                                    Collections.sort(arrayListA);
                                    break;
                                case "c":
                                    Collections.reverse(arrayListA);
                                    break;
                                case "d":
                                    System.out.println(arrayListA.size());
                                    break;
                                case "e":
                                    for (Object o : arrayListA) {
                                        System.out.print(o + " ");
                                    }
                                    break;
                                case "f":
                                    Collections.sort(arrayListA, Collections.reverseOrder());
                                    break;
                                default:
                                    System.out.println("Error.");
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid query");
                        }

                    }
                } else {
                    System.out.println("Invalid number. Choose a number betwen 1 and 100");
                }
                arrayListA.removeAll(arrayListA);
            }
        } else {
            System.out.println("Invalid number. Choose a number betwen 1 and 100");
        }


    }

}

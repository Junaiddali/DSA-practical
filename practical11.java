package com.DSA;
import java.util.Scanner;
public class practical11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of units: ");
            int a = sc.nextInt();
            if (a <= 50) {
                System.out.println("The number of units are " + a * 10);
            } else if (a > 50 && a <= 100) {
                System.out.println("The number of units are " + a * 15);
            } else if (a >= 101 && a <= 200) {
                System.out.println("The number of units are " + a * 20);
            } else if (a >= 201 && a <= 300) {
                System.out.println("The number of units are " + a * 25);
            } else if (a >= 301) {
                System.out.println("The number of units are " + a * 30);
            } else
                System.out.println("Invalid input!");

    }
}

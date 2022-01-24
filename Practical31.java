package com.DSA;
import java.util.Scanner;
public class Practical31 {

    public static void main(String[] args) {
        int[] array = new int[100];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; ) {
            System.out.print("Enter " + ++i + " Number: ");
            array[i] = scan.nextInt();
        }
    }
}

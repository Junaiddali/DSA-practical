package com.DSA;

public class Practical14 {
    public static void main(String[] args) {
        int num = 10, first = 0, second = 1;
        System.out.println("Input number of terms to display : " + num );

        System.out.print("Fibonacci Series = ");
        for (int i=0; i<num; i++){
            System.out.print(second+" ");
            int temp = first;
            first = second;
            second=first+temp;
        }

    }
}

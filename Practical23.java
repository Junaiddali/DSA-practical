package com.DSA;

import java.util.Scanner;

public class Practical23 {
    int length;
    int breath;
    Practical23(int length, int breath){
        this.length = length;
        this.breath =breath;
    }
    public int returnArea(){
        int area = length*breath;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
        Practical23 obj = new Practical23(length,breadth);

        System.out.println("The area of the rectangle is: "+ obj.returnArea());
    }
}

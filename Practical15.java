package com.DSA;
import java.util.Scanner;
public class Practical15 {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to display Square->");
        int num = scan.nextInt();
        int iteration =num;
        for (int i=1; i<iteration; i++){
            num+=iteration;
        }
        System.out.print("Square of Number is:"+num);

    }

}


package com.DSA;
import java.util.Scanner;
public class Practical22 {
    int length;
    int breath;
    public void setDim(int length, int breath){
        this.length = length;
        this.breath =breath;
    }
    public int getArea(){
        int area = length*breath;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
        Practical22 obj = new Practical22();
        obj.setDim(length,breadth);
        System.out.println("The area of the rectangle is: "+ obj.getArea());
    }
}

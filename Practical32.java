package com.DSA;

public class Practical32 {
    public static boolean checkArrays(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 4, 5, 7};
        int[] arrayTwo = {1, 2, 2*2, 5, 7};
        System.out.println("Are these array equal? \n " + checkArrays(arrayOne, arrayTwo));
    }
}

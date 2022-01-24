package com.DSA;

public class Practical34 {
    public static float average(int[] array){
    float num =0;
    for (int i = 0; i < array.length; i++) {
        num += array[i];
    }
    return num/array.length;
}

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20};
        System.out.println("Average of the numbers in array is " + average(array));
    }
}

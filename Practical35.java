package com.DSA;

public class Practical35 {
    public static int secondLargest(int[] intArray){
        int largest = 0;
        int secLargest = 0, index = 0, temp =0;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] < largest && intArray[i] > secLargest){
                secLargest = intArray[i];
                index = i;
            }
            if(intArray[i] >= largest){
                index = temp;
                secLargest = largest;
                largest = intArray[i];
                temp = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 12, 4, 20,3};
        System.out.println("Second largest number is at index " + secondLargest(array));
    }
}

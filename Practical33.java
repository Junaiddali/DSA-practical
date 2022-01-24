package com.DSA;

public class Practical33 {
    public static boolean checkArrays(String[] arr1, String[] arr2){
        if(arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++)
            if (!arr1[i].equals(arr2[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        String[] secondArray = {"Junaid", "Junaid3.0", "JunaidRenewed", "JunaidAli"};
        String[] firstArray = {"Junaid", "Junaid3.0", "JunaidRenewed", "JunaidAli"};
        System.out.println("Both string arrays are equal? \n" + checkArrays(secondArray, firstArray));
    }
}

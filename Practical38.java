package com.DSA;

public class Practical38 {
    public static int removeDuplicateElements(int array[], int length){
        if (length==0 || length==1){
            return length;
        }
        int[] newarr = new int[length];
        int j = 0;
        for (int i=0; i<length-1; i++)//the loop can not be run to store last element because the array will be out of index
        {
            if (array[i] != array[i+1])
            {
                newarr[j++] = array[i];
            }
        }
        newarr[j++] = array[length-1];//here we are doing for getting last element
        //Now we will change the real array
        for (int i=0; i<j; i++)
        {
            array[i] = newarr[i];
        }
        return j;

    }

    public static void main(String[] args) {
        int arr[] = {20,20,30,40,50,50,50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing the array elements without duplication
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Length: "+length);
    }
}

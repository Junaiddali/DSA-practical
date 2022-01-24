package com.DSA;

public class Practical37 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,1}, {5,6,2}, {0,0,0}};
        int[][] matrix2 = {{2,5,1}, {2,8,3}, {5,7,3}};
        int[][] matrix3 = new int[3][3];
        System.out.println("Multiplication of the matrices is ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix3[i][j] = 0;
                for (int k = 0; k < matrix1[j].length; k++) {
                    matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

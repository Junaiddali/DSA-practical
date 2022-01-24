package com.DSA;

public class Practical36 {
    public static void main(String[] args) {
        int[][] twoD = {{5,4,3}, {2, 6, 3},
                {9, 0, 1}, {1, 2, 3}};
        for (int i = 0; i < twoD.length; i++) {
            for (int x = 0; x < twoD[i].length; x++) {
                for (int y = x+1; y < twoD[i].length; y++) {
                    if (twoD[i][x] > twoD[i][y]) {
                        int temp = twoD[i][x];
                        twoD[i][x] = twoD[i][y];
                        twoD[i][y] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

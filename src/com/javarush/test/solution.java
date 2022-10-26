package com.javarush.test;

public class solution {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
       /* MULTIPLICATION_TABLE = new int[][] {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                                            {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

        }
        */
        MULTIPLICATION_TABLE = new int[10][10];
        for (int k = 0; k < 10; k++) {
            MULTIPLICATION_TABLE[0][k] = k + 1;
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE[0][j] * (i + 1);
            }



        }
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                System.out.print(MULTIPLICATION_TABLE[m][n] + " ");
            }
            System.out.println();
        }
    }
}
package com.javarush.test;

import java.util.Scanner;
public class solution {
        public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] array;
        if (N>0) {
            array = new int[N];
            for (int i=0; i<N; i++) {
                array[i] = console.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = N-1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            } else {
                for (int i = 0; i < N; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}

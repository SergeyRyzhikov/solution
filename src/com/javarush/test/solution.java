package com.javarush.test;

import java.util.Scanner;
public class solution {
        public static int [] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int N = console.nextInt();
        array = new int[N];
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < N; i++) {
            System.out.print("Введите элемент № "+(i+1) + ": ");
            array[i] = console.nextInt();
        }
        int min;
        min = array[0];
            for (int i=1; i<N; i++) {
                if (array[i]<min)
                    min = array[i];
            }
        System.out.print("Минимальный элемент: " + min);

        }
    }
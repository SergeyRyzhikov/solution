package com.javarush.test;

import java.util.Scanner;
public class solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i=0; i<3; i++) {
            String peremstr = strings[i];
            for (int j = i + 1; j < 3; j++) {
                if (peremstr.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
                if (peremstr == null) break;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
    }
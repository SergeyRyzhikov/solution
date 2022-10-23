package com.javarush.test;

public class solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        //напишите тут ваш код
        int i, j;
        for (i=0;i<10;i++)
        {
            for (j=0;j<10;j++)
            {
                System.out.print(land);
            }
            System.out.println();
        }
    }
}

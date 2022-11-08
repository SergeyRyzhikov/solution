package com.javarush.test;

public class Mrakobes {
    private static boolean isAlive = true;
    public static void setlsAlive (boolean param){
    isAlive=param;
    }
    //напишите тут ваш код

    public static void printState() {
        System.out.println("Амиго" + (isAlive ? " НЕ " : " ") + "победил Мракобеса Безумного");
    }
}

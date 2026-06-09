package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric("클레릭", 30, 7);

        int mpRecovery = cleric.pray(3);
        System.out.println(mpRecovery);
    }
}
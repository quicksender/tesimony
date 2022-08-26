package org.example;

import static java.lang.Math.addExact;

public class Main {


    public static void main(String[] args) {
        String s = "The sum is";

        printMessage(s);
        printSum(1,3);
    }


    private static void printMessage(String s) {
        System.out.println(s);
    }

    private static void  printSum(int a, int b) {
        System.out.println(Math.addExact(a,b));
    }





}












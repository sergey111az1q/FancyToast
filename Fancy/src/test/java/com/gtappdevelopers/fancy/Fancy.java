package com.gtappdevelopers.fancy;

public class Fancy {
    public static int plus(int a,int b){
        return a + b;
    }
    public static int minus(int a,int b){
        return a - b;
    }
    public static int multi(int a,int b){
        return a * b;
    }
    public static int div(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("Div by zero error");
        } else {
            return a/b;

        }
    }



}

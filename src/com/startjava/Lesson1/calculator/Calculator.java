package com.startjava.Lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        char mathlSign = '^';
        int a = 8;
        int b = 4;
        int result = 1;

        if(mathlSign == '+') {
            result = a + b;
        } else if(mathlSign == '-') {
            result = a - b;
        } else if(mathlSign == '*') {
            result = a * b;
        } else if(mathlSign == '/') {
            result = a / b;
        } else if(mathlSign == '^') {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        } else if(mathlSign == '%') {
            result = a % b;
        }
        System.out.println(result);
    }
}
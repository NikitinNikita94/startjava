package com.startjava.Lesson1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int num = 6;
        while (num >= -6) {
            System.out.println(num);
            num -= 2;
        }

        int evenNumber = 10;
        int sum = 0;
        do {
            if (evenNumber % 2 != 0)
                sum += evenNumber;
                evenNumber++;
        } while (evenNumber < 21);
        System.out.println(sum);
    }
}
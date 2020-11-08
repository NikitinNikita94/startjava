package com.startjava.Lesson1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int unknowNumber = 9;
        int userNumber = 12;
        int trysCount = 0;
        System.out.println("Задача: угадать число от (0 до 100).\nВведите число:");
        
        do {
            trysCount++;
            if(userNumber < unknowNumber) {
                userNumber++;
                System.out.println("Введеное вами число меньше того, что загадал компьютер");
            } else if(userNumber > unknowNumber) {
                userNumber--;
                System.out.println("Введеное вами число ,больше того, что загадал компьютер");
            }
        } while (userNumber != unknowNumber);
        System.out.println("Вы угадали число!");
        System.out.println("Количество попыток: " + trysCount);
    }
}

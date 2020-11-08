package com.startjava.Lesson2_3.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int unknowNumber;
    private int trysCount = 0;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        unknowNumber = (int) (Math.random() * 101);
        do {
            System.out.println("Игрок  " + player1.getName() + " введите число:");
            player1.setNumber(scanner.nextInt());
            if (compareNumbers(player1.getNumber())) {
                break;
            }

            System.out.println("Игрок  " + player2.getName() + " введите число:");
            player2.setNumber(scanner.nextInt());
            if (compareNumbers(player2.getNumber())) {
                break;
            }
        } while(true);
    }

    public boolean compareNumbers(int number) {
            trysCount++;
            if (number == unknowNumber) {
                System.out.println("Вы угадали загаданное число! Это число: " + number);
                System.out.println("Количество попыток: " + trysCount);
                return true;
            }
            System.out.println("Загаданное число " + (number < unknowNumber ? "больше" : "меньше"));
            return false;
    }
}
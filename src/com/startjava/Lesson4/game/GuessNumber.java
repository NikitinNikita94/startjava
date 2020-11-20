package com.startjava.Lesson4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int unknowNumber;
    private static int trysCount = 0;
    private final Player player1;
    private final Player player2;
    private boolean checkout = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        unknowNumber = (int) (Math.random() * 101);
        do {
            checkNumber(player1, player2);
        } while(checkout == false);
    }

    private boolean compareNumbers(Player player, int number) {
        if (number == unknowNumber) {
            trysCount++;
            return checkout = true;
        }
        trysCount++;
        System.out.println("Загаданное число  " + (number < unknowNumber ? "больше" : "меньше"));
        return checkout = false;
    }

    private void enteringNumber(Player player) {
        System.out.println("Игрок  " + player.getName() + " введите число:");
        player.setEnteredNumber(scanner.nextInt());
    }

    private void checkNumber(Player player1, Player player2) {
        for (int i = 0; i < 10; i++) {
            enteringNumber(player1);
            checkout = compareNumbers(player1, player1.getEnteredNumber()[i]);
            if (i == player1.getEnteredNumber().length && checkout != true) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
                checkout = true;
                break;
            }
            if (checkout == true) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки");
                outputArray(player1);
                break;
            }

            enteringNumber(player2);
            checkout = compareNumbers(player2, player2.getEnteredNumber()[i]);
            if (i == player2.getEnteredNumber().length && checkout != true) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                checkout = true;
                break;
            }
            if (checkout == true) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки");
                outputArray(player2);
                break;
            }
        }
    }

    private void outputArray(Player player) {
        for (int i = 0; i < player.getEnteredNumber().length; i++) {
            System.out.print(player.getEnteredNumber()[i] + " ");
        }
        System.out.println(" ");
    }
}
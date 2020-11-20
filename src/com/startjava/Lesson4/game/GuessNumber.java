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
        do {
            checkPlayer(player1);
            checkPlayer(player2);
        } while(checkout == false);
    }

    private void checkPlayer(Player player) {
        unknowNumber = (int) (Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            inputNumber(player);
            checkout = compareNumbers(player, player.getEnteredNumber()[i]);
            if (i == player.getEnteredNumber().length && checkout != true) {
                System.out.println("У игрока " + player.getName() + " закончились попытки");
                checkout = true;
                break;
            }
            if (checkout == true) {
                System.out.println("Игрок " + player.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки");
                showEnteredNumbers(player);
                break;
            }
        }
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок  " + player.getName() + " введите число:");
        player.setEnteredNumber(scanner.nextInt());
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

    private void showEnteredNumbers(Player player) {
        for (int enteredNumber : player.getEnteredNumber()) {
            System.out.print(enteredNumber + " ");
        }
        System.out.println(" ");
    }
}
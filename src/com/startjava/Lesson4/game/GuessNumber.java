package com.startjava.Lesson4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int unknowNumber;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        unknowNumber = (int) (Math.random() * 101);
        System.out.println("У вас 10 попыток");
        player1.clearNumbers();
        player2.clearNumbers();
        for (int i = 0; i < 10; i++) {
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }

        showEnteredNumbers(player1);
        showEnteredNumbers(player2);
    }

    private boolean makeMove(Player player) {
        if (player.getCountAttempts() < 10) {
            inputNumber(player);
            if (compareNumbers(player)) {
                System.out.println("Игрок " + player.getName() + " угадал число " + unknowNumber + " с " + player.getCountAttempts() + " попытки");
                return true;
            }
        } else {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок  " + player.getName() + " введите число:");
        player.setEnteredNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getLastNumber() == unknowNumber) {
            return true;
        }
        System.out.println("Загаданное число  " + (player.getLastNumber() < unknowNumber ? "больше" : "меньше"));
        return false;
    }

    private void showEnteredNumbers(Player player) {
        for (int enteredNumber : player.getEnteredNumbers()) {
            System.out.print(enteredNumber + " ");
        }
        System.out.println(" ");
    }
}
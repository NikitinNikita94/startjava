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
        player1.initNumbers();
        player2.initNumbers();
        for (int i = 0; i < 10; i++) {
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        if (player.getCountAttempts() < 9) {
            inputNumber(player);
            if (compareNumbers(player)) {
                System.out.println("Игрок " + player.getName() + " угадал число " + unknowNumber + " с " + player.getCountAttempts() + " попытки");
                showEnteredNumbers(player1, player2);
                return true;
            }
        } else {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            showEnteredNumbers(player1, player2);
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

    private void showEnteredNumbers(Player player1, Player player2) {
        for (int enteredNumber : player1.getEnteredNumbers()) {
            System.out.print(enteredNumber + " ");
        }
        System.out.println(" ");

        for (int enteredNumber : player2.getEnteredNumbers()) {
            System.out.print(enteredNumber + " ");
        }
        System.out.println(" ");
    }
}
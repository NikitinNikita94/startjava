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
        do {
            for (int i = 0; i < 10; i++) {
                makeMove(player1);
                makeMove(player2);
            }
        } while(false);
    }

    private boolean makeMove(Player player) {
                inputNumber(player);
                compareNumbers(player);
                if (player.getEnteredNumber()[player.getCountAttempts()] == player.getEnteredNumber().length) {
                    System.out.println("У игрока " + player.getName() + " закончились попытки");
                    return true;
                }
                if (player.getLastNumber() == unknowNumber) {
                    System.out.println("Игрок " + player.getName() + " угадал число " + unknowNumber + " с " + player.getCountAttempts() + " попытки");
                    showEnteredNumbers(player);
                    return true;
                }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок  " + player.getName() + " введите число:");
        player.setEnteredNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getLastNumber() == unknowNumber) {
            player.setCountAttempts(+1);
            return true;
        }
        player.setCountAttempts(+1);
        System.out.println("Загаданное число  " + (player.getLastNumber()< unknowNumber ? "больше" : "меньше"));
        return false;
    }

    private void showEnteredNumbers(Player player) {
        for (int enteredNumber : player.getEnteredNumber()) {
            System.out.print(enteredNumber + " ");
        }
        System.out.println(" ");
    }
}
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
            unknowNumber = (int) (Math.random() * 101);
            System.out.println("Игрок  " + player1.getName() + " введите число:");
            for (int i = 0; i < 10; i++) {
                checkout = compareNumbers(player1, player1.setEnteredNumber(scanner.nextInt()));
                if (i == player1.getLastNumber() && checkout != true) {
                    System.out.println("У игрока " + player1.getName() + " закончились попытки");
                    checkout = true;
                    break;
                }
                if (checkout == true) {
                    System.out.println("Игрок " + player1.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки");
                    for (int j = 0; j < player1.getEnteredNumbers().length; j++) {
                        System.out.print(player1.getEnteredNumbers()[j] + " ");
                    }
                    break;
                }

                System.out.println("Игрок  " + player2.getName() + " введите число:");
                checkout = compareNumbers(player2, player2.setEnteredNumber(scanner.nextInt()));
                if (i == player2.getLastNumber() && checkout != true) {
                    System.out.println("У игрока " + player2.getName() + " закончились попытки");
                    checkout = true;
                    break;
                }
                if (checkout == true) {
                    System.out.println("Игрок " + player2.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки ");
                    for (int j = 0; j < player2.getEnteredNumbers().length; j++) {
                        System.out.print(player2.getEnteredNumbers()[j] + " ");
                    }
                    break;
                }
            }
        } while(checkout == false);
    }

    public boolean compareNumbers(Player player, int number) {
        if (number == unknowNumber) {
            trysCount++;
            return checkout = true;
        }
        trysCount++;
        System.out.println("Загаданное число " + (number < unknowNumber ? "больше" : "меньше"));
        return checkout = false;
    }

}
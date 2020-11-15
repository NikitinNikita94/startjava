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
                player1.setNumber(scanner.nextInt());
                player1.setEnteredNumbers(player1.getNumber());
                checkout = compareNumbers(player1.getNumber());
                if (i == player1.lastArrayNum() && checkout != true) {
                    System.out.println("У игрока " + player1.getName() + " закончились попытки");
                    checkout = true;
                    break;
                }
                if (checkout == true) {
                    System.out.println("Игрок " + player1.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки");
                    player1.copyGetEnteredNumbers();
                    System.out.println(" ");
                    player2.copyGetEnteredNumbers();
                    break;
                }

                System.out.println("Игрок  " + player2.getName() + " введите число:");
                player2.setNumber(scanner.nextInt());
                player2.setEnteredNumbers(player2.getNumber());
                checkout = compareNumbers(player2.getNumber());
                if (i == player2.lastArrayNum() && checkout != true) {
                    System.out.println("У игрока " + player2.getName() + " закончились попытки");
                    checkout = true;
                    break;
                }
                if (checkout == true) {
                    System.out.println("Игрок " + player2.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки ");
                    player2.copyGetEnteredNumbers();
                    System.out.println(" ");
                    player1.copyGetEnteredNumbers();
                    break;
                }
            }
        } while(checkout == false);
    }

    public boolean compareNumbers(int number) {
        if (number == unknowNumber) {
            trysCount++;
            return checkout = true;
        }
        trysCount++;
        System.out.println("Загаданное число " + (number < unknowNumber ? "больше" : "меньше"));
        return checkout = false;
    }

}
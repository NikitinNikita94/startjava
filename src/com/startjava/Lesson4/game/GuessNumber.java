package com.startjava.Lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int unknowNumber;
    private static int trysCount = 0;
    private final Player player1;
    private final Player player2;
    private int [] arrayPlayer1 = new int[10];
    private int [] arrayPlayer2 = new int[10];
    private boolean checkout = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        do {
            unknowNumber = (int) (Math.random() * 101);
            System.out.println("Игрок  " + player1.getName() + " введите число:");
            for (int i = 0; i < arrayPlayer1.length; i++) {
                player1.setNumber(scanner.nextInt());
                arrayPlayer1[i] = player1.getNumber();
                player1.setArray(Arrays.copyOf(arrayPlayer1, arrayPlayer1.length));
                checkout = compareNumbers(player1.getNumber());
                if (i == 9 && checkout != true) {
                    System.out.println("У игрока" + player1.getName() + "закончились попытки");
                    checkout = true;
                    break;
                }
                if (checkout == true) {
                    System.out.println("Игрок " + player1.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки");
                    player1.setArray(arrayPlayer1);
                    break;
                }

                System.out.println("Игрок  " + player2.getName() + " введите число:");
                player2.setNumber(scanner.nextInt());
                arrayPlayer2[i] = player2.getNumber();
                player1.setArray(Arrays.copyOf(arrayPlayer2, arrayPlayer2.length));
                checkout = compareNumbers(player2.getNumber());
                if (i == 9 && checkout != true) {
                    System.out.println("У игрока " + player2.getName() + " закончились попытки");
                    checkout = true;
                    break;
                }
                if (checkout == true) {
                    System.out.println("Игрок " + player2.getName() + " угадал число " + unknowNumber + " с " + trysCount + " попытки ");
                    player2.setArray(arrayPlayer2);
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
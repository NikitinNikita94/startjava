package com.startjava.Lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок1, Введите ваше имя:");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Игрок2, Введите ваше имя:");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guess = new GuessNumber(player1, player2);

        String answer = "да";
        while (answer.equals("да")) {
            guess.start();
            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
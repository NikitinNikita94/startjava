package com.startjava.Lesson4.calc;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "да";
        do {
            System.out.println("Введите данные (пример: 2 * 8): ");
            String inputString = scanner.nextLine();
            String[] inputExpression = inputString.split(" ");
            try {
                calculator.calculate(inputExpression);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка : делить на ноль нельзя" + e);
            }

            System.out.println("Хотите продолжить? [да/нет]:");
            answer = scanner.nextLine();
        } while (answer.equals("да"));
    }
}


package com.startjava.Lesson4.calc;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "да";
        while (answer.equals("да")) {
            System.out.println("Введите данные (пример: 2 * 8): ");
            String inputString = scanner.nextLine();
            String[] inputExpression = inputString.split(" ");
            calculator.calculate(inputExpression);
            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}


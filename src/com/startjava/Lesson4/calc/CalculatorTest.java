package com.startjava.Lesson4.calc;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "да";
        while (answer.equals("да")) {
            System.out.println("Введите данные (пример: 2 * 8): ");
            String enters = scanner.nextLine();
            String[] input = enters.split(" ");
            int firstNumber = Integer.parseInt(input[0]);
            calculator.setNum1(firstNumber);
            char mathOperation = input[1].charAt(0);
            calculator.setOperation(mathOperation);
            int secondNumber = Integer.parseInt(input[2]);
            calculator.setNum2(secondNumber);

            calculator.calculate();
            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}


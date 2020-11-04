package com.startjava.calc;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "да";
        while (answer.equals("да")) {
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);

            System.out.println("Введите математический знак операции:");
            char operational = scanner.next().charAt(0);
            calculator.setOperation(operational);

            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}


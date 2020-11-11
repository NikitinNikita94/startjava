package com.startjava.Lesson4.calc;

import java.util.Scanner;

public class Calculator {

    private int num1;
    private int num2;
    private char operation;
    Scanner scanner = new Scanner(System.in);

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }

    public void calculate(String[] inputExpression) {
        num1 = Integer.parseInt(inputExpression[0]);
        operation = inputExpression[1].charAt(0);
        num2 = Integer.parseInt(inputExpression[2]);

        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '^':
                System.out.println((int) Math.pow(num1, num2));
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
    }
}

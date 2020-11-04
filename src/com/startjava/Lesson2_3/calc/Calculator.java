package com.startjava.calc;

public class Calculator {

    private int num1;
    private int num2;
    private char operation;

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

    public void calculate() {
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
                int result = 1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                System.out.println(result);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
    }
}

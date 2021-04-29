package com.startjava.Lesson4.calc;

public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public void calculate(String[] inputExpression) {
        for (RomanNumeral numeral : RomanNumeral.values()) {
            if (numeral.getKey().equals(inputExpression[0]) || numeral.getKey().equals(inputExpression[2])) {
                num1 = RomanNumeral.toInt(inputExpression[0]);
                operation = inputExpression[1].charAt(0);
                num2 = RomanNumeral.toInt(inputExpression[2]);
                int rezult = checkOperation(num1, operation, num2);
                System.out.println(RomanNumeral.toRomeNumber(rezult));
                break;
            }
        }

        for (RomanNumeral num : RomanNumeral.values()) {
            if (num.getValue() == RomanNumeral.toIntParse(inputExpression[0])) {
                num1 = RomanNumeral.toIntParse(inputExpression[0]);
                operation = inputExpression[1].charAt(0);
                num2 = RomanNumeral.toIntParse(inputExpression[2]);
                int rezult = checkOperation(num1, operation, num2);
                System.out.println(rezult);
                break;
            }
        }
    }

    public int checkOperation(int num1, char operation, int num2) {
        if ((num1 >= 0 && num2 >= 0) && (num1 <= 10 && num2 <= 10)) {
            switch (operation) {
                case '+':
                    return (num1 + num2);
                case '-':
                    return (num1 - num2);
                case '*':
                    return (num1 * num2);
                case '/':
                    return (num1 / num2);
                case '^':
                    return ((int) Math.pow(num1, num2));
                case '%':
                    return (num1 % num2);
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
        } else {
            System.out.println("Вводите цифры от 1 до 10");
        }
        return 0;
    }
}

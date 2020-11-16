package com.startjava.Lesson4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, enteredNumbers.length);
    }

    public int setEnteredNumber(int number) {
        enteredNumbers[countAttempts] = number;
        countAttempts++;
        return number;
    }

    public int getLastNumber() {
        return enteredNumbers.length - 1;
    }
}


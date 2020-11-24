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
        return Arrays.copyOf(enteredNumbers, countAttempts);
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[countAttempts] = number;
        countAttempts++;
    }

    public int getLastNumber() {
        return enteredNumbers[countAttempts - 1];
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void clearNumbers() {
        for(int i = 0; i < countAttempts; i++) {
            Arrays.fill(getEnteredNumbers(), countAttempts);
            countAttempts = 0;
        }
    }
}


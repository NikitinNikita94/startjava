package com.startjava.Lesson4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int [] enteredNumbers = new int [10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setEnteredNumbers(int number) {
        this.enteredNumbers[count] = number;
        count++;

    }
    
    public int[] copyGetEnteredNumbers() {
        int [] x = Arrays.copyOf(getEnteredNumbers(), getEnteredNumbers().length);
        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }
        return x;
    }

    public int lastArrayNum() {
        int lastNum = getEnteredNumbers().length - 1;
        return lastNum;
    }
}


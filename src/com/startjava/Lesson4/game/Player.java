package com.startjava.Lesson4.game;

public class Player {

    private String name;
    private int number;
    private int [] array = new int [10];

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

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.array[i] = number;
        }
    }
}


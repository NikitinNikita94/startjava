package com.startjava.robot;

public class Jaeger {

    private String mark;
    private String status;
    private String origin;
    private float height;
    private double weight;
    private int speed;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void shoot() {
        System.out.println("Выполняет функцию стрельбы");
    }

    public void go() {
        System.out.println("Выполняет функцию движения");
    }
}
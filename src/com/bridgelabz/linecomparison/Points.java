package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Points {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void getPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point x");
        setX(sc.nextInt());
        System.out.println("Enter Point y");
        setY(sc.nextInt());
    }
}

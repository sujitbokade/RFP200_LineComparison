package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Points point1 = new Points();
        Points point2 = new Points();
        Length line1 = new Length();
        Length line2 = new Length();

        System.out.println("Enter First Line Points");
        point1.getPoint();
        point2.getPoint();
        Double length1 = line1.length(point1.getX(), point1.getY(), point2.getX(), point2.getY());
        System.out.println("Length of Line 1 is: " + length1);

        System.out.println("Enter Second Line Points");
        point1.getPoint();
        point2.getPoint();
        Double length2 = line2.length(point1.getX(), point1.getY(), point2.getX(), point2.getY());
        System.out.println("Length of Line 2 is: " + length2);

        //Compare Two Lines
        if (length1.equals(length2)) {
            System.out.println("Both Lines are Equals");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("Length of Line1 is greater than Length of Line2");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("Length of Line1 is Less than Length of Line2");
        }
    }
}


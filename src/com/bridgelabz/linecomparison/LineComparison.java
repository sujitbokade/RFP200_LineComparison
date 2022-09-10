package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        //Take Input
        System.out.println("--Enter First Line Points--");
        System.out.println("Enter a Point x1");
        int x1 = sc.nextInt();
        System.out.println("Enter a Point y1");
        int y1 = sc.nextInt();
        System.out.println("Enter a Point x2");
        int x2 = sc.nextInt();
        System.out.println("Enter a Point y2");
        int y2 = sc.nextInt();

        //Calculation & Display
        double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of First Line is " + length1);
        System.out.println();

        //Take Input
        System.out.println("--Enter Second Line Points--");
        System.out.println("Enter a Point a1");
        int a1 = sc.nextInt();
        System.out.println("Enter a Point b1");
        int b1 = sc.nextInt();
        System.out.println("Enter a Point a2");
        int a2 = sc.nextInt();
        System.out.println("Enter a Point b2");
        int b2 = sc.nextInt();

        //Calculation & Display
        double length2 = Math.sqrt((Math.pow((a2 - a1), 2)) + (Math.pow((b2 - b1), 2)));
        System.out.println("Length of Second Line is " + length2);

        //Compare Two Lines
        if (length1 == length2) {
            System.out.println("Both Lines are Equals");
        } else if (length1 > length2) {
            System.out.println("Length of First Line is Greater Than Length of Second Line ");
        } else {
            System.out.println("Length of First Line is Less Than Length of Second Line");
        }
    }
}


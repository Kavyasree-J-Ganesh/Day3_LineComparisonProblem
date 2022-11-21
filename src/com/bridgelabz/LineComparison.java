package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting point of the line");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("Enter the ending point of the line");

        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double lineLength = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println(lineLength);

    }
}

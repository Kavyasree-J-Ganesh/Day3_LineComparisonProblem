package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting point of the first line");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("Enter the ending point of first the line");

        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double lineLength1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));



        System.out.print("Enter the starting point of the second line");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.print("Enter the ending point of second the line");

        int x4 = scan.nextInt();
        int y4 = scan.nextInt();

        double lineLength2 = Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));

        if(lineLength2 == lineLength1){
            System.out.println("Lines are of same length");
        }else{
            System.out.println("Lines are of different length");
        }

    }
}

package com.bridgelabz;

import java.util.Scanner;

//LineComparison class is a containing a line variables and the methods
public class LineComparison {

    public static void main(String [] args)
    {
        System.out.println("Welcome To The Line Comparison Computation Program ");
        Scanner input = new Scanner(System.in);  //created a scanner class object to get the system inputs
        System.out.print("Enter x1: ");
        int x1 = input.nextInt(); // Accepted double values as a input for x1 start point of line 1

        System.out.print("Enter y1: ");
        int y1 = input.nextInt(); // Accepted start point of line 1

        System.out.print("Enter x2 Endpoint for line 1: ");
        int x2 = input.nextInt(); // Accepted Endpoint for line 1

        System.out.print("Enter y2 Endpoint for line 1 : ");
        int y2 = input.nextInt(); // Accepted Endpoint for line 1

        System.out.print("Enter x3 : ");
       int x3 = input.nextInt(); //Accepted start point of line 2

        System.out.print("Enter y3: ");
        int y3 = input.nextInt(); //Accepted start point of line 2

        System.out.print("Enter x4 Endpoint for line 2: ");
        int x4 = input.nextInt(); //Accepted Endpoint of line 2

        System.out.print("Enter y4 Endpoint for the line 2: ");
        int y4 = input.nextInt(); //Accepted Endpoint of line 2

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of the line segment: " + length);

       int l1X=x2;
       int l1Y=y2;
       int l2X=x4;
       int l2Y=y4;

        //Integer.valueOf converts primitive int to the int objects to use the methods
        if (Integer.valueOf(x1).equals(x3) && Integer.valueOf(x2).equals(x4) && Integer.valueOf(y2).equals(y4) && Integer.valueOf(y1).equals(y3)) {
            System.out.println("Line endpoints are equal");
        } else {
            System.out.println("Line endpoints are not equal");
        }


    }

}

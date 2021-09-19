/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt the user for their desired choice of F to C or C to F
    use the formula to calculate the desired formula


 */


import java.util.Scanner;

public class solution18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a 1 to convert to F or enter 2 to convert to C:");
        int form = sc.nextInt();

        if(form==1){
            System.out.println("Enter temperature in Farenheit: ");
            int temp = sc.nextInt();
            int fconv = (temp - 32) * 5/9;
            System.out.println("The temperature in Celsius is "+(fconv)+".");

        }
        else if(form==2){
            System.out.println("Enter temperature in Celsius: ");
            int temp = sc.nextInt();
            int cconv = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Celsius is "+(cconv)+".");
        }


    }
}

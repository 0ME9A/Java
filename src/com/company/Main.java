package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println("Please enter 0 for exit and 1 for start the game: ");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        if (start==0){
            System.out.println("You are not playing the game...");
        }
        else {
            System.out.println("Great choice Let's start... ");
            System.out.println("1. Please follow the rules it's important.");
            System.out.println("2. Enter numbers between 1 to 10.");
            System.out.println("3. Only numbers are valid other type of data not acceptable.");
            System.out.println("4. Only 3 time you can enter wrong data type or invalid numbers after that the game will over.");
            Random random = new Random();
            int number = random.nextInt(10);
            number=number+1;
            int i=1;
            int wrong_input = 0;
            System.out.println("Now guess the number... " + number);

            while (i<6){
                int guess_num = scanner.nextInt();
                if (guess_num>10 || guess_num<1){
                    if (wrong_input>=3){
                        System.out.println("Sorry you have been entered too many wrong sessions... ");

                        break;
                    }
                    else {
                        wrong_input++;
                        System.out.println("You have entered invalid session please follow the rule and enter valid sessions...");
                        System.out.println("1. Enter numbers between 1 to 10.");
                        System.out.println("2. Only numbers are valid other type of data not acceptable.");
                        System.out.println("3. Only 3 time you can enter wrong data type or invalid numbers after that the game will over.");
                        System.out.println("4. Please follow the rules it's important.");
                        System.out.println("\nYou can enter just "+(3-wrong_input)+ " more wrong data type. ");

                    }

                }
                else {
                    if (guess_num==number){
                        System.out.println("Well done You guessed it in "+ i +" attempt... ");
                        break;
                    }
                    else {
                        if (guess_num>number){
                            System.out.println("You have been guessed too high... ");
                        }
                        else {
                            System.out.println("You have been guessed too low... ");
                        }
                        System.out.println("Try again and remember you have just "+(5-i)+" life... ");
                    }
                    if (i==5){
                        System.out.println("\nGame over You have been lost...");
                    }
                    i++;
                }
            }
        }
    }
}

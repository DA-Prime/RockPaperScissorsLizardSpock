/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itse.danielavalos;

/**
 *
 * @author da720
 */
import java.util.Scanner;

public class RockPaperScissorLizardSpock2DA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Scanner will be used for the user input.
        
        System.out.println("Welcome to Rock-Paper-Scissors-Lizard-Spock");
        System.out.println("Enter a number from 0 to 4!!! 0 is Scissors,");
        System.out.println("1 is Rock, 2 is Paper, 3 is Lizard" +
                "and 4 is Spock.");
        System.out.println(" ");
        System.out.println("Make sure you enter a number ranging from 0 to 4"
                + " or else the game will not function.");
        System.out.print("Enter your number: ");
        int userNum = input.nextInt();
        
        int cpuNum = (int)(Math.random() * 5);
        System.out.println(" ");
        /*
            Instead of 10 we'll use 5 because the range for this game should 
            be from 0 to 4 therefore needing to cut 10 and use 5.
        */
        /*
            Each case statement will be used to check if the userInt variable
            is equal to a number ranging from 0 - 4 with the next step being
            calling a method to check what the cpuNum is and if the user wins,
            lose or ties the game with the CPU.
        */
        switch (userNum) {
            case 0 -> userScissors(cpuNum);
            
            case 1 -> userRock(cpuNum);
            
            case 2 -> userPaper(cpuNum);
            
            case 3 -> userLizard(cpuNum);
            
            case 4 -> userSpock(cpuNum);
            
            default -> System.out.println("You didn't enter a number ranging"
                    + " from 0 to 4, click the play button to try again.");
        }
    }
    
    public static void userScissors(int cpuInt) {
        switch (cpuInt) {
            case 0 -> System.out.println("The Computer is Scissors and you "
            + "are Scissors as well, it's a draw!!!");
            case 1 -> System.out.println("The Computer is Rock and you are"
            + " Scissors, you Lose!!!");
            case 2 -> System.out.println("The Computer is Paper and you are"
            + " Scissors, you Win!!!");
            case 3 -> System.out.println("The Computer is Lizard and you are"
            + " Scissors, you Win!!!");
            case 4 -> System.out.println("The Computer is Spock and you are"
            + " Scissors, you Lose!!!");
        }
    }
    
    public static void userRock(int cpuInt) {
        switch (cpuInt) {
            case 0 -> System.out.println("The Computer is Scissors and you"
            + " are Rock, you Win!!!");
            case 1 -> System.out.println("The Computer is Rock and you are"
            + " Rock as well, it's a draw!!!");
            case 2 -> System.out.println("The Computer is Paper and you are"
            + " Rock, you Lose!!!");
            case 3 -> System.out.println("The Computer is Lizard and you are"
            + " Rock, you Win!!!");
            case 4 -> System.out.println("The Computer is Spock and you are"
            + " Rock, you Lose!!!");
        }
    }
    
    public static void userPaper(int cpuInt) {
        switch (cpuInt) {
            case 0 -> System.out.println("The Computer is Scissors and you"
            + " are Paper, you Lose!!!");
            case 1 -> System.out.println("The Computer is Rock and you are"
            + " Paper, you Win!!!");
            case 2 -> System.out.println("The Computer is Paper and you are"
            + " Paper, it's a draw!!!");
            case 3 -> System.out.println("The Computer is Lizard and you are"
            + " Paper, you Lose!!!");
            case 4 -> System.out.println("The Computer is Spock and you are"
            + " Paper, you Win!!!");
        }
    }
    
    public static void userLizard(int cpuInt) {
        switch (cpuInt) {
            case 0 -> System.out.println("The Computer is Scissors and you"
            + " are Lizard, you Lose!!!");
            case 1 -> System.out.println("The Computer is Rock and you are"
            + " Lizard, you Lose!!!");
            case 2 -> System.out.println("The Computer is Paper and you are"
            + " Lizard, you Win!!!");
            case 3 -> System.out.println("The Computer is Lizard and you are"
            + " Lizard, it's a draw!!!");
            case 4 -> System.out.println("The Computer is Spock and you are"
            + " Lizard, you Win!!!");
        }
    }
    
    public static void userSpock(int cpuInt) {
        switch (cpuInt) {
            case 0 -> System.out.println("The Computer is Scissors and you"
            + " are Spock, you Win!!!");
            case 1 -> System.out.println("The Computer is Rock and you are"
            + " Spock, you Win!!!");
            case 2 -> System.out.println("The Computer is Paper and you are"
            + " Spock, you Lose!!!");
            case 3 -> System.out.println("The Computer is Lizard and you are"
            + " Spock, you Lose!!!");
            case 4 -> System.out.println("The Computer is Spock and you are"
            + " Spock, it's a tie!!!");
        }
    }
}

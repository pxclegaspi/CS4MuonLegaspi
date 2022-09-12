/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02muonlegaspi;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Ex02MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        boolean endApplication = false;
        int minimumInteger = 0, maximumInteger = 9, rangeOfIntegers = maximumInteger - minimumInteger + 1;
        
        while(endApplication != true) {
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("- Start game");
            System.out.println("- Change settings");
            System.out.println("- End application");
            String whatWillYouDo = sc.nextLine();
            
            switch(whatWillYouDo) {
                case "Start game":
                    int randomNumber = (int) Math.floor(Math.random() * rangeOfIntegers) + minimumInteger;
                    System.out.printf("The minimum number is %s, and the maximum number is %s. Let's begin!%n", minimumInteger, maximumInteger);
                    
                    for(int i = 3; i > 0; i--) {
                        System.out.printf("You have %s guess(es) left! What's your guess?", i);
                        String guessString = sc.nextLine();
                        int guessInteger = Integer.parseInt(guessString);
                        
                        switch(guessInteger) {
                            case guessInteger > randomNumber:
                                if(i == 0) {
                                    System.out.println("You lost. Very sad. :(");
                                } else {
                                    System.out.print("Guess lower! ");
                                }
                                break;
                            case guessInteger < randomNumber:
                                if(i == 0) {
                                    System.out.println("You lost. Very sad. :(");
                                } else {
                                    System.out.print("Guess higher! ");
                                }
                                break;
                            
                            default:
                                System.out.println("You did it! Congratulations!");
                                
                                break;
                        }
                    }
                    
                    System.out.printf("Do you wanna play again? [y/n] ");
                    String playAgain = 
                    break;
                case "Change settings":
                    
                    break;
                case "End application":
                    System.out.println("Thank you for playing Higher or Lower! See you soon!");
                    endApplication = true;
                    break;
                default:
                    System.out.printf("Sorry, we can't recognize your input.%n%n");
                    break;
            }
        }
    }
    
}

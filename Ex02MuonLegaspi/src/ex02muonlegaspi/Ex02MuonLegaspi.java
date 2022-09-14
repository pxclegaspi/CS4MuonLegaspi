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
        int minimumInteger = 0, maximumInteger = 9, rangeOfIntegers = maximumInteger - minimumInteger + 1, guessCount = 3;
        
        while(endApplication != true) {
            System.out.printf("%nWelcome to Higher or Lower! What will you do?%n");
            System.out.println("- Start game");
            System.out.println("- Change settings");
            System.out.println("- End application");
            String whatWillYouDo = sc.nextLine();
            
            switch(whatWillYouDo) {
                case "Start game":
                    int playAgainInteger;
                    
                    do {
                        int randomNumber = (int) Math.floor(Math.random() * rangeOfIntegers) + minimumInteger;
                        System.out.printf("%nThe minimum integer is %s, and the maximum integer is %s. Let's begin!%n", minimumInteger, maximumInteger);
                    
                        for(int i = guessCount; i > 0; i--) {
                            System.out.printf("You have %s guess(es) left! What's your guess? ", i);
                            String guessString = sc.nextLine();
                            int guessInteger;
                            while(!guessString.matches("[0-9]+")) {
                                System.out.print("That's probably not a integer. Try again. ");
                                guessString = sc.nextLine();
                            }
                            guessInteger = Integer.parseInt(guessString);
                            
                            if(guessInteger < randomNumber) {
                                if(i == 1) {
                                    System.out.println("You lost. Very sad...");
                                } else {
                                    System.out.print("Guess higher! ");
                                }
                            }
                            if(guessInteger > randomNumber) {
                                if(i == 1) {
                                    System.out.println("You lost. Very sad...");
                                } else {
                                    System.out.print("Guess lower! ");
                                }
                            }
                            if(guessInteger == randomNumber) {
                                System.out.println("You guessed the number! Congratulations!");
                                break;
                            }
                        }
                        
                        do {
                            System.out.print("Type '1' to play again, and '0' to go back to the main menu. ");
                            String playAgainString = sc.nextLine();
                            playAgainInteger = Integer.parseInt(playAgainString); 
                        } while(playAgainInteger != 0 && playAgainInteger != 1);
                    } while(playAgainInteger == 1);
                    break;
                case "Change settings":
                    int changeSettingsAgainInteger;
                    
                    do {
                        String minimumIntegerString, maximumIntegerString, guessCountString;

                        System.out.printf("%nWhat will be the new minimum number? ");
                        minimumIntegerString = sc.nextLine();
                        minimumInteger = Integer.parseInt(minimumIntegerString);
                        System.out.print("What will be the new upper limit? ");
                        maximumIntegerString = sc.nextLine();
                        maximumInteger = Integer.parseInt(maximumIntegerString);
                        System.out.print("What will be the new number of guesses? ");
                        guessCountString = sc.nextLine();
                        guessCount = Integer.parseInt(guessCountString);

                        System.out.printf("The new minimum integer is %s. The new maximum integer is %s. The new number of guesses is %s.%n", minimumInteger, maximumInteger, guessCount);

                        do {
                            System.out.print("Type '1' to change the settings again, and '0' to go back to the main menu. ");
                            String changeSettingsAgainString = sc.nextLine();
                            changeSettingsAgainInteger = Integer.parseInt(changeSettingsAgainString);
                        } while(changeSettingsAgainInteger != 0 && changeSettingsAgainInteger != 1);
                    } while(changeSettingsAgainInteger == 1);
                    break;
                case "End application":
                    System.out.printf("%nThank you for playing Higher or Lower! See you soon!%n");
                    endApplication = true;
                    break;
                default:
                    System.out.printf("Sorry, we can't recognize your input.%n%n");
                    break;
            }
        }
    }
    
}
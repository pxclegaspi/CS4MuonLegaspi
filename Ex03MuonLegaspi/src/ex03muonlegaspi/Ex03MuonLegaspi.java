/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03muonlegaspi;

import java.util.Scanner;

/**
 *
 * @author Patric Legaspi
 */
public class Ex03MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        sampleClass inMainClass = new sampleClass();
        System.out.println(inMainClass.phrase);
        
        System.out.print("How many times do you want me to write 'I love copypasta!'? ");
        inMainClass.counter = sc.nextInt();
        while(inMainClass.counter < 0) {
            System.out.print("Silly human. There's no such thing as a negative number of times! Type another integer. ");
            inMainClass.counter = sc.nextInt();
        }
        for(int i = 0; i < inMainClass.counter; i++) {
            System.out.println("I love copypasta!");
        }
        
        System.out.print("Thank you for using a sample test for the class! Type anything to continue. ");
        do {
            inMainClass.anything = sc.nextLine();
        } while(inMainClass.anything == "");
        System.out.printf("%n%n%n%n%n%n%n");
        
        
        
    }
    
}

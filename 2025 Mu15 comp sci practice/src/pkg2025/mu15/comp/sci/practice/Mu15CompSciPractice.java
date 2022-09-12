/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2025.mu15.comp.sci.practice;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Mu15CompSciPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 3;
        double decimal = 4.5;
        char letter = '@';
        String name = "Legaspi";
        String want = "copypasta";
        boolean trueOrFalse = true;
        
        System.out.println("Hoy, " + name + "! Namimihasa ka na!");
        System.out.print(num + "" + decimal + letter + name + trueOrFalse);
        
        if(trueOrFalse) {
            System.out.println("Nice! You're not telling lies.");
        } else {
            System.out.println("Why you lie?");
        }
        
        for(int p=0; p<5; p++) {
            System.out.printf("I love %s! %n", want);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String inputExample = sc.nextLine();
        int result = Integer.parseInt(inputExample);
        
        Student mark = new Student("Mark");
        mark.name = "Mark";
        mark.grade = 1.75;
        mark.money = 500;
        mark.introduce();
        
        Student josh = new Student("Josh");
        josh.name = "Josh";
        josh.introduce();
    }
    
}

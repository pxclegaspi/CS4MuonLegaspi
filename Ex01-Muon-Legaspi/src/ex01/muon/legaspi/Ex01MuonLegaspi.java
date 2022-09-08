/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.muon.legaspi;

/**
 *
 * @author MUON
 */
public class Ex01MuonLegaspi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nameOne = "Patric Legaspi";
        int ageOne = 15;
        double heightOne = 170.18;
        
        String nameTwo = "Spongebob Squarepants";
        int ageTwo = 23;
        int episodesTwo = 250;
        
        String nameThree = "Philippine Science High School System";
        int ageThree = 58;
        int campusesThree = 16;
        
        System.out.printf("Name of Student: %s %n", nameOne);
        System.out.printf("Age: %s %n", ageOne);
        System.out.printf("Height: %s cm %n%n", heightOne);
        
        System.out.printf("Favorite Show: %s%n", nameTwo);
        System.out.printf("Number of years airing: %s%n", ageTwo);
        System.out.printf("Number of episodes: %s%n%n", episodesTwo);
        
        System.out.printf("Current school: %s%n", nameThree);
        System.out.printf("Number of years running: %s%n", ageThree);
        System.out.printf("Number of campuses: %s%n%n", campusesThree);
        
        if(ageThree>ageTwo) {
            System.out.printf("%s is older than %s.%n", nameThree, nameTwo);
        } else {
            System.out.printf("%s is older than %s.%n", nameTwo, nameThree);
        }
        
        while(ageOne < ageTwo) {
            int counter = 0;
            if(ageOne + counter == ageTwo) {
                System.out.printf("%s is as old in %s years as %s is now.%n", nameOne, counter, nameTwo);
            } else {
                counter++;
            }
        }
    }
    
}

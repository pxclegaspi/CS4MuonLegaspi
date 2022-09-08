/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01muonlegaspi;

/**
 *
 * @author Patric Legaspi
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
        
        int counter = 0;
        while(ageOne < ageTwo) {
            if(ageOne + counter == ageTwo) {
                System.out.printf("%s is as old in %s years as %s is now.%n", nameOne, counter, nameTwo);
                break;
            }
            counter++;
        }
        
        System.out.printf("There are at least %s times as much %s episodes as campuses in %s.%n", episodesTwo/campusesThree, nameTwo, nameThree);
    }
    
}

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
        
        char sample1Char, sample2Char, sample3Char;
        int sample1Int, sample2Int, sample3Int;
        
        System.out.println("Let's try testing Java classes first.");
        System.out.println("Type three characters. Space them out by pressing 'Enter' or the sapcebar after every character. If you type multiple characters without pressing 'Enter' or the sapcebar, only the first character will be considered.");
        sample1Char = sc.next().charAt(0);
        sample2Char = sc.next().charAt(0);
        sample3Char = sc.next().charAt(0);
        
        Sample sample1 = new Sample(sample1Char);
        Sample sample2 = new Sample(sample2Char);
        Sample sample3 = new Sample(sample3Char);
        
        if(sample1.letter == sample2.letter) {
            if(sample1.letter == sample3.letter) {
                System.out.printf("All of the three characters you typed are the same.%n%n");
            } else {
                System.out.printf("Only two of the three characters you typed are the same.%n%n");
            }
        } else {
            if(sample1.letter == sample3.letter) {
                System.out.printf("Only two of the three characters you typed are the same.%n%n");
            } else {
                if(sample2.letter == sample3.letter) {
                    System.out.printf("Only two of the three characters you typed are the same.%n%n");
                } else {
                    System.out.printf("All of the three characters you typed are different.%n%n");
                }
            }
        }
        
        System.out.printf("Thank you for using a sample test for Java classes! We shall now continue to the main part of this program.%n%n%n%n%n%n%n");
        
        String song1Name = "Sunshine Rainbow White Pony", song2Name = "Astronomia";
        int song1Views = 14811040, song2Views = 2675492;
        boolean song1After2019 = false, song2After2019 = false;
        Song song1 = new Song(song1Name, song1Views, song1After2019);
        Song song2 = new Song(song2Name, song2Views, song2After2019);
        
        String singerName = "Lil Nas X";
        int singerNoOfPerformances = 0;
        double singerEarnings = 0;
        Song favoriteSong = song1;
        Singer singer = new Singer(singerName, singerNoOfPerformances, singerEarnings, favoriteSong);
        
        int audienceCount = 12;
        System.out.printf("%s needs some money. To remedy that, they're going to do a performance.%n", singer.name);
        System.out.printf("%s is going to sing their favorite song, %s, which has %s views in Youtube. It is %s that the song was made after 2019.%n", singer.name, singer.favoriteSong.name, singer.favoriteSong.views, singer.favoriteSong.after2019);
        
        System.out.printf("%nAfter the performance, the guards told %s that %s people attended.%n", singer.name, audienceCount);
        singer.performForAudience(audienceCount);
        System.out.printf("%s now has %s dollars, and has performed %s time/s.%n%n", singer.name, singer.earnings, singer.noOfPerformances);
        
        singer.changeFavSong(song2);
        System.out.printf("%s has changed their favorite song to %s, which has %s views in Youtube. It is %s that the song was made after 2019.%n", singer.name, singer.favoriteSong.name, singer.favoriteSong.views, singer.favoriteSong.after2019);
        
        //The code below contains the things I would like to add here in the future if I have time for it.
        /*
        boolean allowToPerform;
        System.out.printf("%s needs some money. Do you want them to perform? [y/n] ", singer.name);
        allowToPerform = sc.nextBoolean();
        
        while(allowToPerform != false) {
            audienceCount = (int) Math.floor(Math.random() * 100) + 1;
            System.out.printf("%nAfter the performance, the guards told %s that %s people attended.%n%n", singer.name, audienceCount);
            singer.performForAudience(audienceCount);
            System.out.printf("%s now has %s dollars, and has performed %s time/s.%n", singer.name, singer.earnings, singer.noOfPerformances);
            System.out.printf("Do you want %s to perform again? [y/n] ", singer.name);
            allowToPerform = sc.nextBoolean();
        }
        */
    }
}

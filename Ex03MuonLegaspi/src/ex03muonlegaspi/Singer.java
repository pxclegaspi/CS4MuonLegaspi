/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03muonlegaspi;

/**
 *
 * @author MUON
 */
public class Singer {
    String name;
    int noOfPerformances = 0;
    double earnings = 0;
    Song favoriteSong;
    
    public Singer(String n, int nOP, double e, Song favSong) {
        name = n;
        noOfPerformances = nOP;
        earnings = e;
        favoriteSong = favSong;
    }
    
    public void performForAudience(int audienceCount) {
        noOfPerformances++;
        earnings += audienceCount * 100;
    }
    
    public void changeFavSong(Song newFavoriteSong) {
        favoriteSong.name = newFavoriteSong.name;
        favoriteSong.views = newFavoriteSong.views;
        favoriteSong.after2019 = newFavoriteSong.after2019;
    }    
}

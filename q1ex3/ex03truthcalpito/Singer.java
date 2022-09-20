/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03truthcalpito;

/**
 *
 * @author USER
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer (String name, Song favoriteSong) {
        this.name = name; 
        this.favoriteSong = favoriteSong;
        this.noOfPerformances = 0;
        this.earnings = 0;
    }
    
    //get information
    public void getInfo() {
        System.out.printf("\n%s has performed %d time(s) and has %.2f total earning(s). His favorite song is %s in the key of %c and lasting for %.2f minutes. It is from the album %s.\n", name, noOfPerformances, earnings, favoriteSong.name, favoriteSong.key, favoriteSong.duration, favoriteSong.fromAlbum);
    } 
    
    //increases noOfPerformances by 1 and earnings by 100 for each person (e.g. 5 people results in 500 increase)
    public void performForAudience(int noOfPeople) {
        noOfPerformances += 1;
        earnings += 100*noOfPeople;
        
        System.out.printf("\n%s performed %s for %d person(s). After the performance, they now have %.2f total earning(s) and %d performance(s) in their career.\n", name, favoriteSong.name, noOfPeople, earnings, noOfPerformances);
    } 
    
    public void changeFavSong(String name, double duration, char key, String fromAlbum) {
        favoriteSong = new Song(name, duration, key, fromAlbum);
    } 
}

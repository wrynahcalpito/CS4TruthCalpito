/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04truthcalpito;

/**
 *
 * @author USER
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
      
    public Singer (String name, Song favoriteSong) {
        this.name = name; 
        this.favoriteSong = favoriteSong;
        this.noOfPerformances = 0;
        this.earnings = 0;
    } 
    
    //CHANGING INFORMATION (SETTER METHODS)
    public void changeSingerFavSong(String name, double duration, char key, String fromAlbum) {
        favoriteSong = new Song(name, duration, key, fromAlbum);
    } 
    
    public void addEarnings(double newEarnings) { //note that name and noOfPerformances (because it's an activity of the performer) cannot be changed, but i've decided earnings could be change (due to other forms of income)
        this.earnings += newEarnings;
    }
    
    //GETTING INFORMATION (GETTER METHODS)
    public void getSingerInfo() {
        System.out.printf("\n%s has performed %d time(s) and has %.2f total earning(s). His favorite song is %s in the key of %c and lasting for %.2f minutes. It is from the album %s.\n", name, noOfPerformances, earnings, favoriteSong.getName(), favoriteSong.getKey(), favoriteSong.getDuration(), favoriteSong.getAlbum());
    }
    
    public String getName() {
        return name;
    }
    
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
        
    public double getEarnings() {
        return earnings;
    }
    
    public Song getSingerFavoriteSong () {
        return favoriteSong;
    }
    
    //OTHER METHODS
    //increases noOfPerformances by 1 and earnings by 100 for each person (e.g. 5 people results in 500 increase)
    public void performForAudience(int noOfPeople) {
        noOfPerformances += 1;
        totalPerformances += 1; 
        earnings += 100*noOfPeople;
        
        //System.out.println(totalPerformances); (for testing)
        System.out.printf("\n%s performed %s for %d person(s). After the performance, they now have %.2f total earning(s) and %d performance(s) in their career.\n", name, favoriteSong.getName(), noOfPeople, earnings, noOfPerformances);
    } 
    //2 singers performing together
    public void performForAudience(Singer otherSinger, int noOfPeople){
        noOfPerformances += 1;
        otherSinger.noOfPerformances += 1;
        //totalPerformances += 1; (for testing)
        earnings += (100*noOfPeople)/2;
        otherSinger.earnings += (100*noOfPeople)/2;
        
        //System.out.println(totalPerformances); (for testing)
        System.out.printf("\n%s and %s performed %s and %s together for %d person(s). After the performance, they now have %.2f total earning(s) each and %d performance(s) in their career.\n", name, otherSinger.name, favoriteSong.getName(), otherSinger.favoriteSong.getName(), noOfPeople, earnings, noOfPerformances);
    }
}

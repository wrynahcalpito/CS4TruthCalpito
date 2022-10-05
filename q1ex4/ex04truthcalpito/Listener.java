/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04truthcalpito;

/**
 *
 * @author USER
 */
public class Listener {
    private String name, favoriteSong, favoriteArtist, favoriteGenre;
    
    public Listener (String name, String favoriteSong, String favoriteArtist, String favoriteGenre) {
        this.name = name;
        this.favoriteSong = favoriteSong;
        this.favoriteArtist = favoriteArtist;
        this.favoriteGenre = favoriteGenre;
    }
    
    //CHANGING INFORMATION (SETTER METHODS)
    public void changeListenerFavSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
    public void changeListenerFavArtist(String favoriteArtist) {
        this.favoriteArtist = favoriteArtist;
    }

    public void changeListenerFavGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }
    
    //GETTING INFORMATION (GETTER METHODS)
    public void introduceListener() {
        System.out.printf("\nHi! I am %s. My favorite song is %s and my favorite artist is %s. I like %s!\n", name, favoriteSong, favoriteArtist, favoriteGenre);
    }
    
    public String getName() {
        return name;
    }
    
    public String getListenerFavSong() {
        return favoriteSong;
    }
    
    public String getListenerFavArtist() {
        return favoriteArtist;
    }    
    
    public String getListenerFavGenre() {
        return favoriteGenre;
    }
}

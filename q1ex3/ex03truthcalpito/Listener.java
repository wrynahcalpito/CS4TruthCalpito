/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03truthcalpito;

/**
 *
 * @author USER
 */
public class Listener {
    String name;
    String favoriteSong;
    String favoriteArtist;
    String favoriteGenre;
    
    public Listener (String name, String favoriteSong, String favoriteArtist, String favoriteGenre) {
        this.name = name;
        this.favoriteSong = favoriteSong;
        this.favoriteArtist = favoriteArtist;
        this.favoriteGenre = favoriteGenre;
    }
    
    public void introduceListener() {
        System.out.printf("\nHi! I am %s. My favorite song is %s and my favorite artist is %s. I like %s!\n", name, favoriteSong, favoriteArtist, favoriteGenre);
    }
}

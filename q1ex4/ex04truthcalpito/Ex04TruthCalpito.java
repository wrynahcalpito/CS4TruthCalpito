/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04truthcalpito;

/**
 *
 * @author USER
 */
public class Ex04TruthCalpito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Listener wrynah = new Listener("Wrynah", "I Want to Be With You", "chloe moriondo", "Indie Pop");
        wrynah.introduceListener();
        Listener kirby = new Listener("Kirby", "Happier", "Olivia Rodrigo", "Pop");
        kirby.introduceListener();
        Listener carla = new Listener("Carla", "Pretty Boy", "Red Velvet", "K-pop");
        carla.introduceListener();
        
        Singer wonpil = new Singer("Wonpil", new Song("Sincerity", 3.23, 'D', "Pilmography"));
        wonpil.getSingerInfo();
        wonpil.performForAudience(12); 
        wonpil.changeSingerFavSong("A writer in a love story", 3.45, 'C', "Pilmography");
        wonpil.getSingerInfo();
        
        Singer youngk = new Singer("Young K", new Song("Guard You", 3.6, 'A', "Eternal"));
        youngk.getSingerInfo();
        youngk.performForAudience(wonpil, 20);
        
        wonpil.getSingerInfo();
        youngk.getSingerInfo();
    }
}
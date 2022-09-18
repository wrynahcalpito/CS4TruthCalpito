/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03truthcalpito;

/**
 *
 * @author USER
 */
public class Ex03TruthCalpito {

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
        
        Singer KimWonpil = new Singer("Kim Wonpil", 0, 0, new Song("Sincerity", 3.23, 'D', new Album("Pilmography", 10, 36.58)));
        KimWonpil.getInfo();
        KimWonpil.performForAudience(12); 
        KimWonpil.changeFavSong("A writer in a love story", 3.45, 'C', new Album("Pilmography", 10, 36.58));
        KimWonpil.getInfo();
    }
    
}

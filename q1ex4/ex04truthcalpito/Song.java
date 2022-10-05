/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04truthcalpito;

/**
 *
 * @author USER
 */
public class Song {
    private String name, fromAlbum;
    private double duration;
    private char key;
    
    public Song (String name, double duration, char key, String fromAlbum) {
        this.name = name;
        this.duration = duration;
        this.key = key;
        this.fromAlbum = fromAlbum;
    }
    
    //GETTING INFORMATION (GETTER METHODS)
    // note that it will not have setter methods as they are changed alongside the favorite song
    public String getName() {
        return name;
    }
        
    public String getAlbum() {
        return fromAlbum;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public char getKey() {
        return key;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class Ex06TruthCalpitoWrynahDale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireType f1 = new FireType("Firey", 20, 10);
        WaterType w1 = new WaterType("Watery", 10, 20);
        GrassType g1 = new GrassType("Grassy", 15, 15);
        
        do {
            f1.attack(w1);
            w1.attack(g1);
            g1.attack(f1);
        } while(f1.getHP() > 0 && w1.getHP() > 0 && g1.getHP() > 0);
    }
    
}

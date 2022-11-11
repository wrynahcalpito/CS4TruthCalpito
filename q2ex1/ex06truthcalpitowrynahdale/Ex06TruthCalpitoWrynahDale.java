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
        FireType f1 = new FireType("Tepig", 20, 10);
        WaterType w1 = new WaterType("Sobble", 10, 20);
        GrassType g1 = new GrassType("Chikorita", 15, 15);
        
        while (f1.getIsAlive() && g1.getIsAlive() && w1.getIsAlive()) {
            f1.charge();
            f1.attack(w1);
            w1.guard();
            
            if(!f1.getIsAlive() || !w1.getIsAlive()) {
                break;
            }
            
            w1.attack(g1);
            g1.guard();
            
            if(!w1.getIsAlive() || !g1.getIsAlive()) {
                break;
            }
            
            g1.charge();
            g1.attack(f1);
            
            if(!g1.getIsAlive() || !f1.getIsAlive()) {
                break;
            }
        } 
    }
}

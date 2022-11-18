/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class Ex07TruthCalpitoWrynahDale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer t1 = new Trainer("Ash");
        Trainer t2 = new Trainer("Iris");
        Trainer t3 = new Trainer("Giovanni");
        FireType f1 = new FireType("Tepig", 20, 10);
        WaterType w1 = new WaterType("Sobble", 10, 20);
        GrassType g1 = new GrassType("Chikorita", 15, 15);
        NPC npc1 = new NPC("Carlamarie");
        NPC npc2 = new NPC("Kurtharvey");
        Location l1 = new Location("Tokyo", "Pokemon Fighting");
        
        t2.inspect(l1);
        t1.inspect(f1);
        t2.inspect(w1);
        t3.inspect(g1);
        t2.inspect(npc1);
        t1.inspect(npc2);
        t3.inspect(npc2);
    }
}
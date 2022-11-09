/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class FireType extends Monster {
    
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        atk = base * 1.3;
        def = base * 0.7;
    }
    
    @Override
    public void special(){
        super.special();
        atk += 2;
        hp -= maxHP * 0.1;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06truthcalpitowrynahdale;

/**
 *
 * @author USER
 */
public class WaterType extends Monster {
    
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base);
        atk = base * 0.7;
        def = base * 1.3;
    }
    
    @Override
    public void special(){
        super.special();
        def += 2;
        hp -= maxHP * 0.1;
    }
}
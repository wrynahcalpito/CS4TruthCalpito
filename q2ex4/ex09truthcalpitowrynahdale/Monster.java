/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex09truthcalpitowrynahdale;
import java.util.ArrayList;

public abstract class Monster implements Interactive {
    protected final String name, type, strongAgainst, weakAgainst; //private fields are changed to protected
    protected int maxHP, hp, xp, lvl;
    protected double atk, def; //changed from int to double
    protected boolean guard, charge, isAlive = true; //added a boolean which indicates if they are alive or not
    protected static ArrayList<Monster> monsterList = new ArrayList<>();
    
    //SETTER METHOD
    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        xp = 0;
        lvl = 1;
        monsterList.add(this);
        guard = false;
        charge = false;
    }
    
    //GETTER METHODS
    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public double getAtk() {
        return atk;
    }
    public double getDef() {
        return def;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }
    public boolean getIsAlive() {
        return isAlive;
    }
    
    //FIGHT FUNCTIONS
    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        if(m.guard){
            m.guard = false;
            damage *= 0.7;
        }
        if(charge){
            charge = false;
            damage *= 1.3;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");
        gainXP(2);                                                  // every attack raises XP by 2

        if(m.getHP() <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
            gainXP(10);                                             // defeating a monster raises XP by 10
            isAlive = false; //declares that they are no longer alive
        }        
    }

    public void guard(){
        guard = true;
        System.out.println(name + " put up its guard. It will receive 30% less damage on the next attack.");
    }

    public void charge(){
        charge = true;
        System.out.println(name + " charged. Its next attack will do 30% more damage.");
    }

    public void rest(){
        hp += maxHP * 0.15;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }

    public abstract void special();

    public void resetHealth(){
        hp = maxHP;
    }

    // handles all increases in XP
    private void gainXP(int i){
        xp += i;
        if(xp >= 100){
            xp %= 100;
            lvl++;
            maxHP += 5;
            hp += 5;
            atk += 2;
            def += 2;
            System.out.println(name + " levelled up to " + lvl + "!");
        }
    }
    
    public void interact() {
        System.out.printf("I am %s, a %s monster!%n", name, type);
    }
    
    public static Monster selectMonster(String n) throws MonsterNotFoundException {
        boolean found = false;
	for(Monster m : monsterList){
            if(m.getName().equals(n)){
		found = true;
                break;
            }
            else {
                found = false;
            }
	}
        
        if(!found) {
            throw new MonsterNotFoundException("Monster " + n + " not found.%n");
        }
	return null;
    }

}

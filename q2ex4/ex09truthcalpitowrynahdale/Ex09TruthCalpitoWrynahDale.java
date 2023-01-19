/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09truthcalpitowrynahdale;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ex09TruthCalpitoWrynahDale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MonsterNotFoundException, AlreadyCapturedException, FullTeamException, NotInTeamException {
        Scanner sc = new Scanner(System.in);
        
        Trainer player = new Trainer("Steve");
        Monster m0 = new Monster("Rattata", "Normal", "None", "None", 15, 5);
        Monster m1 = new Monster("Meowth", "Normal", "None", "None", 15, 5);
        Monster m2 = new Monster("Kangaskhan", "Normal", "None", "None", 15, 5);
        Monster m3 = new Monster("Tauros", "Normal", "None", "None", 15, 5);
        Monster m4 = new Monster("Ditto", "Normal", "None", "None", 15, 5);
        Monster m5 = new Monster("Eevee", "Normal", "None", "None", 15, 5);
        Monster m6 = new Monster("Porygon", "Normal", "None", "None", 15, 5);
        Monster m7 = new Monster("Snorlax", "Normal", "None", "None", 15, 5);
        Monster m8 = new Monster("Sentret", "Normal", "None", "None", 15, 5);
        Monster m9 = new Monster("Dunsparce", "Normal", "None", "None", 15, 5);
                
        String input = "";
        
        while(!input.equals("exit")){
            System.out.print("What will the trainer do? ");
            input = sc.nextLine();
            Monster selected = null;
            if(input.equals("catch") || input.equals("release")){
                System.out.print("Which monster? ");
                String name = sc.nextLine();
                selected = Monster.selectMonster(name);
            }
            
            switch(input){
                case "catch":
                    player.sureCapture(selected);
                    break;
                case "release":
                    player.release(selected);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02truthcalpito;

/**
 *
 * @author TRUTH **/
import java.util.Scanner;
public class Ex02TruthCalpito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guessesLimit = 3; 
        int lowerLimit = 1;
        int upperLimit =10;
        boolean isPlaying = true;
        
        while (isPlaying) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Welcome to Higher or Lower! What will you do? \n-Start game \n-Change settings \n-End application\n");
            String userDecision = sc.nextLine();

            if(userDecision.equalsIgnoreCase("start game")) {
                int random = (int) Math.floor(Math.random()*10) + 1;
                
                do {
                    System.out.printf("What is the number? ", guessesLimit);
                    int ans = sc.nextInt();

                    for(int guessesLeft = guessesLimit - 1; guessesLeft > 0; guessesLeft--) {
                        if(random > ans) {
                            System.out.printf("Guess higher! You have %d guess(es) left.", guessesLeft);
                        }

                        else if (random < ans) {
                            System.out.printf("Guess lower! You have %d guess(es) left. What is your guess?", guessesLeft);
                        }
                        
                        else if (random == ans) {
                            System.out.printf("You are right!");
                        }
                    } 
                } while(ans != random);
            }

            else if(userDecision.equalsIgnoreCase("change settings")) {
                //changing the settings
                System.out.print("Lower limit: ");
                lowerLimit = sc.nextInt();
                System.out.print("Upper limit: ");
                upperLimit = sc.nextInt();
                System.out.print("Guesses: ");
                guessesLimit = sc.nextInt();
                
                //checking
                /** System.out.println(lowerLimit);
                System.out.println(upperLimit);
                System.out.println(guessesLimit); **/
            }

            else if(userDecision.equalsIgnoreCase("end application")) {
                System.out.print("Thank you for playing!");
                isPlaying = false;
            }
        }
    }
    
}

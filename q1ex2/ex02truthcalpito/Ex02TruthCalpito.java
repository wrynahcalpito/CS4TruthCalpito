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
        int upperLimit = 10;
        boolean isPlaying = true;
        
        while (isPlaying) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nWelcome to Higher or Lower! What will you do? \n-Start game \n-Change settings \n-End application\nEnter: ");
            String userDecision = sc.nextLine();

            if(userDecision.equalsIgnoreCase("start game")) {
                int random = (int) Math.floor(Math.random()*upperLimit) + lowerLimit;
                int guessesLeft = guessesLimit - 1;
                boolean isRight = false;
                
                while(!isRight) {                    
                    System.out.print("\nWhat is the number? ");
                    int ans = sc.nextInt();
                    
                    if (guessesLeft == 0) {
                        System.out.printf("\nYou do not have guesses left. Sorry!\nThe answer is %d.\n", random);
                        break;
                    }
                                      
                    if(ans >= lowerLimit && ans <= upperLimit) {
                        if(random > ans) {
                            System.out.printf("Guess higher! You have %d guess(es) left.", guessesLeft); 
                        }

                        else if (random < ans) {
                            System.out.printf("Guess lower! You have %d guess(es) left.", guessesLeft);
                        }

                        else if (random == ans) {
                            System.out.printf("\nYou are right! The number is %d and you got it with %d guess(es) left.\n", random, guessesLeft);
                            isRight = true;
                        }
                    }
                    
                    else if (ans > upperLimit || ans < lowerLimit) {
                        System.out.printf("\nInvalid input. Your answer must be between %d and %d. Please try again.\nYou have %d guess(es) left.\n", lowerLimit, upperLimit, guessesLeft);
                    }
                    
                    guessesLeft--;
                }
            }

            else if(userDecision.equalsIgnoreCase("change settings")) {
                //changing the settings
                
                do {
                    System.out.print("Lower limit: ");
                    lowerLimit = sc.nextInt();
                    System.out.print("Upper limit: ");
                    upperLimit = sc.nextInt();
                    System.out.print("Guesses: ");
                    guessesLimit = sc.nextInt();
                    
                    if(lowerLimit >= upperLimit) {
                        System.out.print("\nYour lower limit is either greater than or equal to the upper limit which is invalid. Please try again.\n\n");
                    }
                } while(lowerLimit >= upperLimit);
                
                /** checking
                System.out.println(lowerLimit);
                System.out.println(upperLimit);
                System.out.println(guessesLimit); **/
            }

            else if(userDecision.equalsIgnoreCase("end application")) {
                System.out.print("\nThank you for playing!\n");
                isPlaying = false;
            }
            
            else {
                System.out.print("\nInvalid input. Please try again to play Higher or Lower!\n");
            }
        }
    }
}

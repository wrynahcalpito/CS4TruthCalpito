/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01truthcalpito;

/**
 *
 * @author TRUTH
 */
public class Ex01TruthCalpito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaring variables
        String member1 = "Park Sungjin";
        String position1 = "Rhythm Guitarist";
        int age1 = 29;

        String member2 = "Kang Younghyun";
        String position2 = "Bassist";
        int age2 = 28;

        String member3 = "Kim Wonpil";
        String position3 = "Keyboard/Synth";
        int age3 = 28;

        String member4 = "Dowoon";
        String position4 = "Drummer";
        int age4 = 27;

        //printing information
        System.out.printf("ALL YOU NEED TO KNOW ABOUT DAY6 MEMBERS (2022) \n\n%s \n%s \n%d \n\n%s \n%s  \n%d \n\n%s \n%s \n%d \n\n%s \n%s \n%d", member1, position1, age1, member2, position2, age2, member3, position3, age3, member4, position4, age4);

        //operations
        int totalAge = age1 + age2 + age3 + age4;

        System.out.printf("\n \nFUN FACTS & FAQs \n \nHow old is DAY6 altogether? %d years old \n\n%s does not have the same position as %s: ", totalAge, member2, member1);
        System.out.print(position2 != position1);

        System.out.printf("\n\n%s is older than %s: ", member4, member1);
        System.out.print(age4 > age1);
    }   
}


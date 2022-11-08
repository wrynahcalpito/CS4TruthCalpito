/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extracredittruthcalpito;

/**
 *
 * @author USER
 */
public class ExtraCreditTruthCalpito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Wonpil");
        Student s2 = new Student("Sungjin");
        Student s3 = new Student("Younghyun");
        
        Section c1 = new Section("Tired");
        c1.addStudent(s1);
        c1.addStudent(s2);
        Section c2 = new Section("Sleepy");
        c2.addStudent(s3);
        
        Teacher t1 = new Teacher("Carla", "Computer Science", c1, c2);
        Teacher t2 = new Teacher("Harvey", "Earth Science", c2);
        Teacher t3 = new Teacher("Nicole", "Research", c1); 
        
        Assignment a1 = new Assignment("CS FA1", 2);
        Assignment a2 = new Assignment("ES AA1", 3);
        Assignment a3 = new Assignment("RES ASWR1", 5);
        
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);
        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
    
}

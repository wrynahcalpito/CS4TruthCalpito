/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extracredittruthcalpito;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Student {
    private String name;
    private double timeNeeded, totalTimeNeeded;
    private ArrayList<Assignment> assignments;
    
    public Student(String name) {
        this.name = name;
        this.assignments = new ArrayList();
    }
    
    public String getName() {
        return name;
    }
      
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }
    
    public double getTimeNeeded() {
        for(Assignment a : assignments) {
            timeNeeded = a.getTimeAlloted();
            totalTimeNeeded += timeNeeded;
        }
        
        return totalTimeNeeded;
    }
    
    public void finishAssignment(Assignment a) {
        assignments.remove(a);
    }
}

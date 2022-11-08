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
public class Teacher {
    private String name, subject;
    private ArrayList<Section> sections;
    
    public Teacher(String name, String subject, Section section) {
        this.name = name;
        this.subject = subject;
        this.sections = new ArrayList();
        
        sections.add(section);
    }
    
    public Teacher(String name, String subject, Section section1, Section section2) {
        this.name = name;
        this.subject = subject;
        this.sections = new ArrayList();

        sections.add(section1);
        sections.add(section2);
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public ArrayList<Section> getSections() {
        return sections;
    }
    
    public void giveAssignment(Assignment a) {
        for(Section c : sections) {
            for(Student s : c.getStudents()) {
                s.getAssignments().add(a);
            }
        }
    } 
    
/** - adds the Assignment to each Student in all the sections he/she handles**/
}

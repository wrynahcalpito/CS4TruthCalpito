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
public class Section {
    private String name;
    private ArrayList<Student> students;

    public Section(String name) {
        this.name = name;
        this.students = new ArrayList();
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
}

package exercise14truthcalpitowrynahdale;

import java.util.*;

public class Subject {
    private String name, imgFileName;
    private double units, grade;
    public static ArrayList<Subject> subjectList = new ArrayList();
	
    public Subject(String n, String i, double u, double g){
        name = n;
        imgFileName = i;
        units = u;
        grade = g;
        subjectList.add(this);
    }
    public String getName() {
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public double getUnits() {
        return units;
    }
    public void setUnits(double units) {
        units = units;
    }
    public double getGrade() {
        return grade;
    }
    public static ArrayList<Subject> getSubjectList() {
        return subjectList;
    }
    
    public void setGrade(double grade) {
        grade = grade;
    }
    public static int getListLength() {
        return subjectList.size();
    }
    public static int getSubjectIndex(Subject s) throws NullPointerException {
        if(subjectList.contains(s)) return subjectList.indexOf(s);
        else throw new NullPointerException();
    }
    public static int getSubjectIndex(String s) throws NullPointerException {
        if(subjectList.contains(searchSubject(s))) return subjectList.indexOf(searchSubject(s));
        else throw new NullPointerException();
    }
    public static Subject searchSubject(String search) {
        Subject k = null;
        for(Subject s : subjectList){
            if(s.getName().equalsIgnoreCase(search)) {
                k = s;
                break;}
        }
        return k;
    }
}
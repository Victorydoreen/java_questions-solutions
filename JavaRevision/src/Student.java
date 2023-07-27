

import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private String teacher_name;

    private ArrayList <Integer> grades;
    private ArrayList <String> course_units;

    public Student(int student_id, String student_name, String teacher_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.teacher_name = teacher_name;
        this.grades=new ArrayList<Integer>();
        this.course_units=new ArrayList<String>();
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public ArrayList<String> getCourse_units() {
        return course_units;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

//    public void setGrades(int grades) {
//        this.grades = grades;
//    }

    public void setCourse_units(ArrayList<String> course_units) {
        this.course_units = course_units;
    }
    public void addGrades(Integer grade){
        grades.add(grade);
    }
    public void removeGrades(Integer grade){
        grades.remove(grade);
    }
    public void addCourseUnits(String courseunit){
        course_units.add(courseunit);
    }
    public void removeCourseUnits(String courseunit){
        course_units.remove(courseunit);
    }
    public void studentDetails(){
        System.out.println("Hey y'all print student details:");
        System.out.println("Id: "+ student_id);
        System.out.println("Name: " + student_name );
        System.out.println("Teacher: " + teacher_name);

    }

}

package module1.classes.action;

import module1.classes.entity.Student;

import java.time.LocalDate;
import java.util.*;

public class StudentAction {

  private static List<Student> studentList = Arrays.asList(
          new Student(0, "Oleg", "Titenkov", "FIS", "31.07.1993", 1, "PS22"),
          new Student(1, "Andrei", "Popel", "FAIS", "17.08.1992", 1,"PS22"),
          new Student(2, "Olga", "Makarenko", "FAIS", "17.08.1992",2, "PS22" ),
          new Student(3, "Aleksei", "Loboiko", "FAIS","17.08.1992",2,"PS21" ),
          new Student(4, "Anton", "Savchkov", "FIS", "17.08.1992", 2,"PS21")
  );

  public static void main(String[] args) {
    getStudentsByFaculty(studentList, "FIS");
    getStudentsAfterBirthdayYear(studentList, 1993);
    getStudentsByFacultyAndCourse(studentList);
    getStudentsByGroup(studentList,"PS21");
  }

  private static void getStudentsByFaculty(List<Student> studentList, String faculty) {
    for(Student student : studentList){
      if(student.getFaculty().equals(faculty)){
        System.out.println(student.toString());
      }
    }
  }

  private static void getStudentsByFacultyAndCourse(List<Student> studentList) {
    Set<String> facultySet = new HashSet<>();
    Set<Integer> courseSet = new HashSet<>();
    for(Student student : studentList){
      facultySet.add(student.getFaculty());
      courseSet.add(student.getCourse());
    }
    List<String> facultyList = new ArrayList<>(facultySet);
    List<Integer> courseList = new ArrayList<>(courseSet);
    for (String aFacultyList : facultyList) {
      System.out.println(aFacultyList);
      for (Student student : studentList) {
        if (student.getFaculty().equals(aFacultyList)) {
          System.out.println(student.toString());
        }
      }
    }
    for (Integer aCourseList : courseList) {
      System.out.println("course - " + aCourseList);
      for (Student student : studentList) {
        if (student.getCourse() == aCourseList) {
          System.out.println(student.toString());
        }
      }
    }
  }

  private static void getStudentsAfterBirthdayYear(List<Student> studentList, int year) {
    for(Student student : studentList){
      if(student.getBirthday().isAfter(LocalDate.of(year,1,1))){
        System.out.println(student.toString());
      }
    }
  }

  private static void getStudentsByGroup(List<Student> studentList, String group) {
    for(Student student : studentList){
      if(student.getGroup().equals(group)){
        System.out.println(student.toString());
      }
    }
  }

}

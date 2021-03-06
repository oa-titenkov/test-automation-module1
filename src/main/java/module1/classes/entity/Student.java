package module1.classes.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

  private int id;
  private String lastName;
  private String firstName;
  private String middleName;
  private LocalDate birthday;
  private String address;
  private String phoneNumber;
  private String faculty;
  private int course;
  private String group;

  public Student(int id, String firstName, String lastName, String faculty, String birthday, int course, String group) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.faculty = faculty;
    String[] birthdayArray  = birthday.split("\\.");
    this.birthday = LocalDate.of(
            Integer.parseInt(birthdayArray[2]),
            Integer.parseInt(birthdayArray[1]),
            Integer.parseInt(birthdayArray[0]));
    this.course = course;
    this.group = group;
  }

  public Student(int id, String lastName, String firstName, String middleName) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
  }

  public Student(int id, String lastName, String firstName) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public Student(int id, String lastName, String firstName, String middleName, String faculty) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.faculty = faculty;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", birthday=" + birthday +
            ", address='" + address + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", faculty='" + faculty + '\'' +
            ", course=" + course +
            ", group='" + group + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return id == student.id &&
            course == student.course &&
            Objects.equals(lastName, student.lastName) &&
            Objects.equals(firstName, student.firstName) &&
            Objects.equals(middleName, student.middleName) &&
            Objects.equals(birthday, student.birthday) &&
            Objects.equals(address, student.address) &&
            Objects.equals(phoneNumber, student.phoneNumber) &&
            Objects.equals(faculty, student.faculty) &&
            Objects.equals(group, student.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, birthday, address, phoneNumber, faculty, course, group);
  }
}

package module1.classes.entity;


import java.util.Objects;

public class Patient {

  private int id;
  private String lastName;
  private String firstName;
  private String middleName;
  private String address;
  private String phoneNumber;
  private long medicalCardNumber;
  private String diagnosis;

  public Patient(int id, String lastName, String firstName, String middleName, String address, String phoneNumber, long medicalCardNumber, String diagnosis) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.medicalCardNumber = medicalCardNumber;
    this.diagnosis = diagnosis;
  }

  public Patient(int id, String lastName, String firstName, long medicalCardNumber, String diagnosis) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.medicalCardNumber = medicalCardNumber;
    this.diagnosis = diagnosis;
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

  public long getMedicalCardNumber() {
    return medicalCardNumber;
  }

  public void setMedicalCardNumber(long medicalCardNumber) {
    this.medicalCardNumber = medicalCardNumber;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  @Override
  public String toString() {
    return "Patient{" +
            "id=" + id +
            ", lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", address='" + address + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", medicalCardNumber=" + medicalCardNumber +
            ", diagnosis='" + diagnosis + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Patient patient = (Patient) o;
    return id == patient.id &&
            medicalCardNumber == patient.medicalCardNumber &&
            Objects.equals(lastName, patient.lastName) &&
            Objects.equals(firstName, patient.firstName) &&
            Objects.equals(middleName, patient.middleName) &&
            Objects.equals(address, patient.address) &&
            Objects.equals(phoneNumber, patient.phoneNumber) &&
            Objects.equals(diagnosis, patient.diagnosis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, address, phoneNumber, medicalCardNumber, diagnosis);
  }
}

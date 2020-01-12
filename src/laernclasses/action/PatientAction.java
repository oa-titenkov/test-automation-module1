package laernclasses.action;

import laernclasses.entity.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PatientAction {

  public static void main(String[] args) {
    List<Patient> patientList = new ArrayList<>();
    long medicalCardNumberRange = 10000000000000L;
    patientList.add(new Patient(0, "Oleg", "Titenkov", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "flu"));
    patientList.add(new Patient(1, "Andrei", "Popel", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"));
    patientList.add(new Patient(2, "Olga", "Makarenko", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"));
    patientList.add(new Patient(3, "Andrei", "Loboiko", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"));
    patientList.add(new Patient(4, "Anton", "Savchkov", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"));
//    getPatientsByDiagnosis(patientList, "healthy");
//    getCustomerListByCreditCard(patientList, 5000000000000L, 9000000000000L);
  }

  private static void getPatientsByDiagnosis(List<Patient> patientList, String diagnosis) {
    for(Patient patient : patientList){
      if(patient.getDiagnosis().equals(diagnosis)){
        System.out.println(patient.toString());
      }
    }
  }

  private static void getCustomerListByCreditCard(List<Patient> patientList, long min, long max) {
    for(Patient patient : patientList) {
      if(patient.getMedicalCardNumber() >= min && patient.getMedicalCardNumber() <= max) {
        System.out.println(patient.toString());
      }
    }
  }

}

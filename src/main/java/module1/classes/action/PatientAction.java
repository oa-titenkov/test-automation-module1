package module1.classes.action;

import module1.classes.entity.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PatientAction {

  private static long medicalCardNumberRange = 10000000000000L;
  private static List<Patient> patientList = Arrays.asList(
          new Patient(0, "Oleg", "Titenkov", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "flu"),
          new Patient(1, "Andrei", "Popel", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"),
          new Patient(2, "Olga", "Makarenko", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"),
          new Patient(3, "Andrei", "Loboiko", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"),
          new Patient(4, "Anton", "Savchkov", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy")
  );

  public static void main(String[] args) {
     getPatientsByDiagnosis(patientList, "healthy");
     System.out.println();
     getPatientsByDiagnosis(patientList, "flu");
     System.out.println();
     getCustomerListByCreditCard(patientList, 5000000000000L, 9000000000000L);
     System.out.println();
     getCustomerListByCreditCard(patientList, 6000000000000L, 7000000000000L);
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

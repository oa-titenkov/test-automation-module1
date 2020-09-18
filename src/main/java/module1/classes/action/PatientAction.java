package module1.classes.action;

import module1.classes.entity.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PatientAction {

  private static final long medicalCardNumberRange = 10000000000000L;
  private static final List<Patient> patientList = Arrays.asList(
          new Patient(0, "Oleg", "Titenkov", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "flu"),
          new Patient(1, "Andrei", "Popel", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"),
          new Patient(2, "Olga", "Makarenko", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"),
          new Patient(3, "Andrei", "Loboiko", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy"),
          new Patient(4, "Anton", "Savchkov", ThreadLocalRandom.current().nextLong(medicalCardNumberRange), "healthy")
  );

  public static void main(String[] args) {
     getPatientsByDiagnosis("healthy");
     System.out.println();
     getPatientsByDiagnosis("flu");
     System.out.println();
     getCustomerListByCreditCard(5000000000000L, 9000000000000L);
     System.out.println();
     getCustomerListByCreditCard(6000000000000L, 7000000000000L);
  }

  private static void getPatientsByDiagnosis(String diagnosis) {
    for(Patient patient : patientList){
      if(patient.getDiagnosis().equals(diagnosis)){
        System.out.println(patient.toString());
      }
    }
  }

  private static void getCustomerListByCreditCard(long min, long max) {
    for(Patient patient : PatientAction.patientList) {
      if(patient.getMedicalCardNumber() >= min && patient.getMedicalCardNumber() <= max) {
        System.out.println(patient.toString());
      }
    }
  }
}

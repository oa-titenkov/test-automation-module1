package LearnJavaClasses.Action;

import LearnJavaClasses.Entity.Customer;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CustomerAction {

  public static void main(String[] args) {
    List<Customer> customerList = new ArrayList<>();
    long creditCardRange = 10000000000000000L;
    customerList.add(new Customer(0,"Oleg", "Titenkov", ThreadLocalRandom.current().nextLong(creditCardRange)));
    customerList.add(new Customer(1, "Andrei", "Popel", ThreadLocalRandom.current().nextLong(creditCardRange)));
    customerList.add(new Customer(2, "Olga", "Makarenko", ThreadLocalRandom.current().nextLong(creditCardRange)));
    customerList.add(new Customer(3, "Andrei", "Loboiko", ThreadLocalRandom.current().nextLong(creditCardRange)));
    customerList.add(new Customer(4, "Anton", "Savchkov",ThreadLocalRandom.current().nextLong(creditCardRange)));
    customerList.add(new Customer(5,"Dmitrij", "Zuborev", ThreadLocalRandom.current().nextLong(creditCardRange)));
//    getSortedCustomerList(customerList);
//    getCustomerListByCreditCard(customerList, 4000000000000000L, 5000000000000000L);
  }

  private static void getSortedCustomerList(List<Customer> customerList){
    customerList.sort(Comparator.comparing(Customer::getFirstName).thenComparing(Customer::getLastName));
    customerList.forEach(System.out::println);
  }

  private static void getCustomerListByCreditCard(List<Customer> customerList, long min, long max) {
    for(Customer customer : customerList) {
      if(customer.getCreditCardNumber() >= min && customer.getCreditCardNumber() <= max) {
        System.out.println(customer.toString());
      }
    }
  }
}

package module1.classes.action;

import module1.classes.entity.Customer;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CustomerAction {
  private static long creditCardRange = 10000000000000000L;

  private static List<Customer> customerList = Arrays.asList(
          new Customer(0,"Oleg", "Titenkov", ThreadLocalRandom.current().nextLong(creditCardRange)),
          new Customer(1, "Andrei", "Popel", ThreadLocalRandom.current().nextLong(creditCardRange)),
          new Customer(2, "Olga", "Makarenko", ThreadLocalRandom.current().nextLong(creditCardRange)),
          new Customer(3, "Andrei", "Loboiko", ThreadLocalRandom.current().nextLong(creditCardRange)),
          new Customer(4, "Anton", "Savchkov",ThreadLocalRandom.current().nextLong(creditCardRange)),
          new Customer(5,"Dmitrij", "Zuborev", ThreadLocalRandom.current().nextLong(creditCardRange))
  );

  public static void main(String[] args) {
    getSortedCustomerList(customerList);
    System.out.println();
    getCustomerListByCreditCard(customerList, 1000000000000000L, 5000000000000000L);
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

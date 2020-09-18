package module1.fundamentals.maintask;

import java.util.Scanner;

public class MainTask1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Username: ");
    String name = input.nextLine();
    System.out.println("Hello, " + name);
  }

}

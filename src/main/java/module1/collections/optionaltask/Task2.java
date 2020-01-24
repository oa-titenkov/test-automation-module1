package module1.collections.optionaltask;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Task2 {

  public static void main(String[] args) {
    Stack<Integer> digitsStack = new Stack<>();
    Scanner input = new Scanner(System.in);
    String inputNumber = Integer.toString(input.nextInt());
    for(int i = 0; i < inputNumber.length(); i++) {
      digitsStack.push(inputNumber.charAt(i) - '0');
    }
    System.out.println(digitsStack.stream()
            .sorted(Comparator.reverseOrder())
            .map(Object::toString)
            .collect(Collectors.joining()));
  }
}




package module1.collections.optionaltask;

import java.util.Scanner;
import java.util.Stack;

public class Task7 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите строку: ");
    String inputString = input.nextLine();

    Stack<Character> bracesStack = new Stack<>();


    for(int i=0; i < inputString.length(); i++) {
      char ch = inputString.charAt(i);

      if(ch == '('){
        bracesStack.push(ch);
      }
      else if(ch == '{') {
        bracesStack.push(ch);
      }
      else if(ch == '[') {
        bracesStack.push(ch);
      }
      else if(ch == ')'){
        if(bracesStack.empty())
          System.out.println("false");
        else if(bracesStack.peek() == '(')
          bracesStack.pop();
        else
          System.out.println("false");
      }
      else if(ch == '}'){
        if(bracesStack.empty())
          System.out.println("false");
        else if(bracesStack.peek() == '{')
          bracesStack.pop();
        else
          System.out.println("false");
      }
      else if(ch == ']'){
        if(bracesStack.empty())
          System.out.println("false");
        else if(bracesStack.peek() == '[')
          bracesStack.pop();
        else
          System.out.println("false");
      }
    }
    System.out.println(bracesStack.empty());
  }
}

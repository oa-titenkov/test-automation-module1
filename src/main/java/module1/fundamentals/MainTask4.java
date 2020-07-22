package module1.fundamentals;

public class MainTask4 {

  public static void main(String args[]) {
    int sum = 0;
    int multiply = 1;

    if(args.length == 0) {
      System.out.println("no numbers available");
    } else {
      for(String item : args){
        sum += Integer.parseInt(item);
        multiply *= Integer.parseInt(item);
      }
      System.out.println("sum = " + sum + ", multiply = " + multiply);
    }

  }
  
}

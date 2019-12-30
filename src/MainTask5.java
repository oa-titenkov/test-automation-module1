import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTask5
{
    public static void main(String args[]) {

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        Scanner in = new Scanner(System.in);
        try {
          int n = in.nextInt();
          System.out.println(months[n-1]);
        } catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
          System.out.println("Число месяца введено неверно!");
        }

    }

}

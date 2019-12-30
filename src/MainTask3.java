import java.util.Random;

public class MainTask3 {

  public static void main(String args[]) {

    int n = 10; //количество чисел

    for(int i=1;i<=n;i++){
      System.out.println(new Random().nextInt());
    }

    for(int i=1;i<=n;i++){
      System.out.print(new Random().nextInt() + " ");
    }

  }

}

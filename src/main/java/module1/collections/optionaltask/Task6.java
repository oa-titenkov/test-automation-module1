package module1.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task6 {

  public static void main(String[] args) throws FileNotFoundException {
    List<String> poemToSort = new ArrayList<>();
    File poemFile = new File("src\\resources\\poem.txt");

    Scanner scanner = new Scanner(poemFile);
    while(scanner.hasNextLine()) {
      poemToSort.add(scanner.nextLine());
    }

    Collections.sort(poemToSort);

    for (String line : poemToSort) {
      System.out.println(line);
    }
  }
}

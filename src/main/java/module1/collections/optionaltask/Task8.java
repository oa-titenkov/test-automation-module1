package module1.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task8 {

  public static void main(String[] args) throws FileNotFoundException {
    Set<String> poemSet = new HashSet<>();
    File poemFile = new File("src\\resources\\poem.txt");

    Scanner scanner = new Scanner(poemFile);
    while(scanner.hasNext()) {
      poemSet.add(scanner.next().toLowerCase().replaceAll("[^a-zA-Z ]",""));
    }

    for (String line : poemSet) {
      System.out.println(line);
    }
  }
}

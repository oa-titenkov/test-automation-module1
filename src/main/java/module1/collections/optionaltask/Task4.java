package module1.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    List<String> poemLines = new ArrayList<>();
    File poemFile = new File("src\\resources\\poem.txt");

    try {
      Scanner scanner = new Scanner(poemFile);
      while(scanner.hasNextLine()) {
        poemLines.add(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    poemLines.sort(Comparator.comparingInt(String::length));

    for (String line : poemLines) {
      System.out.println(line);
    }
  }

}
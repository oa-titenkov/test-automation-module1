package module1.collections.optionaltask;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) throws IOException {
    File fileToReverse = new File("src\\resources\\collections_optionaltask1.txt");
    Path fileReversed = Paths.get("src\\resources\\collections_optionaltask1_reversed.txt");
    List<String> stringList = new ArrayList<>();
    Scanner scanner = new Scanner(fileToReverse);
    while(scanner.hasNextLine()) {
      stringList.add(scanner.nextLine());
    }
    Collections.reverse(stringList);
    Files.write(fileReversed, stringList, StandardCharsets.UTF_8);
  }

}

// TODO: 23.01.2020 deal with exception, path route, arraylist declaration

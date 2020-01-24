package module1.collections.optionaltask;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

  public static void main(String[] args) {
    String[] list = new File("src").list();
    assert list != null;
    List<String> listFilesAndDirectories = new ArrayList<>(Arrays.asList(list));
    System.out.println(listFilesAndDirectories);
  }

}

// TODO: 23.01.2020 maybe need to print whole structure?; why use assert?, path
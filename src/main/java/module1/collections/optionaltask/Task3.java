package module1.collections.optionaltask;

import java.io.File;
import java.util.*;

public class Task3 {

  public static void main(String[] args) {
    String[] list = new File("src").list();
    List<String> listFilesAndDirectories = new ArrayList<>(Arrays.asList(list != null ? list : new String[0]));

    System.out.println("Current folder:");
    System.out.println(listFilesAndDirectories);

    System.out.println("Whole tree:");
    System.out.println(listFileTree(new File("src")));
  }

  private static Collection<File> listFileTree(File directoryName) {
    Set<File> fileTree = new HashSet<>();

    if(directoryName == null || directoryName.listFiles() == null){
      return fileTree;
    }

    for (File entry : Objects.requireNonNull(directoryName.listFiles())) {
      if (entry.isFile()) {
        fileTree.add(entry);
      }
      else {
        fileTree.addAll(listFileTree(entry));
      }
    }

    return fileTree;
  }

}
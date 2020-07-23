package module1.collections.optionaltask;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

  public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<>();
    numberList.add(-11);
    numberList.add(2);
    numberList.add(-3);
    numberList.add(7);
    numberList.add(1);

    for(int i=0;i<numberList.size();i++){
      if(numberList.get(i) >= 0){
        numberList.add(0, numberList.get(i));
        numberList.remove(i+1);
      }
    }
  }
}

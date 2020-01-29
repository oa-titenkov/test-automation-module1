package module1.collections.maintask;

import module1.collections.maintask.model.Bouquet;
import module1.collections.maintask.model.Flower;
import module1.collections.maintask.model.FlowerAccessory;

import java.util.*;

public class Action {

  private static List<Flower> flowers = Arrays.asList(
          new Flower(0, "Lily", 10.59, 0.67, 1, 9),
          new Flower (1,"Rose", 15.49, 0.45, 2 , 5),
          new Flower (2,"Orchid", 12.49, 0.35, 2 , 3),
          new Flower (3,"Narcissus", 7.79, 0.2, 2, 7),
          new Flower (3,"Daisy", 6.39, 0.2, 3, 3)
  );
  private static List<FlowerAccessory> flowerAccessories = Arrays.asList(
          new FlowerAccessory(0, "Wrap", 2.49, 1),
          new FlowerAccessory(1, "Wire stem", 8.99, 5),
          new FlowerAccessory(2, "Brooch", 15.99, 2)
  );

  public static void main(String[] args) {
    Bouquet bouquet = makeBouquet(0, flowers, flowerAccessories);
    System.out.println(bouquet);
    System.out.println(findFlowersByStemLengthRange(bouquet, 0.3, 0.5));
    System.out.println(sortFlowersByFreshnessLevel(bouquet, SortTypes.DESCENDING));
  }

  private static Bouquet makeBouquet(int id, List<Flower> flowersList, List<FlowerAccessory> flowerAccessoriesList) {
    double totalPrice = 0;
    for(Flower flower : flowersList) {
      totalPrice += (flower.getPrice() * flower.getAmount());
    }
    for(FlowerAccessory flowerAccessory : flowerAccessoriesList){
      totalPrice += (flowerAccessory.getPrice() * flowerAccessory.getAmount());
    }
    return new Bouquet(id, flowersList, flowerAccessoriesList, totalPrice);
  }

  private static List<Flower> findFlowersByStemLengthRange(Bouquet bouquet, double minLength, double maxLength) {
    List<Flower> flowersInRange = new ArrayList<>();
    for(Flower flower : bouquet.getFlowerList()){
      if(flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength){
        flowersInRange.add(flower);
      }
    }
    return flowersInRange;
  }

  private static Bouquet sortFlowersByFreshnessLevel(Bouquet bouquet, SortTypes sortType) {
    if(sortType == SortTypes.ASCENDING) {
      bouquet.getFlowerList().sort(Comparator.comparingInt(Flower::getFreshnessLevel));
      return bouquet;
    }
    else if(sortType == SortTypes.DESCENDING){
      bouquet.getFlowerList().sort(Comparator.comparingInt(Flower::getFreshnessLevel).reversed());
      return bouquet;
    }
    else return bouquet;
  }

}

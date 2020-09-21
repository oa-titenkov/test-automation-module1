package module1.collections.maintask;

import module1.collections.maintask.action.BouquetAction;
import module1.collections.maintask.model.Bouquet;
import module1.collections.maintask.model.Flower;
import module1.collections.maintask.model.FlowerAccessory;

import java.util.*;

public class Runner {

  private static final List<Flower> flowers = Arrays.asList(
          new Flower(0, "Lily", 10.59, 0.67, 5, 9),
          new Flower (1,"Rose", 15.49, 0.45, 2 , 5),
          new Flower (2,"Orchid", 12.49, 0.35, 1 , 3),
          new Flower (3,"Narcissus", 7.79, 0.2, 2, 7),
          new Flower (3,"Daisy", 6.39, 0.45, 6, 4)
  );
  private static final List<FlowerAccessory> flowerAccessories = Arrays.asList(
          new FlowerAccessory(0, "Wrap", 2.49, 1),
          new FlowerAccessory(1, "Wire stem", 8.99, 5),
          new FlowerAccessory(2, "Brooch", 15.99, 2)
  );

  public static void main(String[] args) {
    Bouquet bouquet = new Bouquet(0, flowers, flowerAccessories);
    System.out.println(bouquet);

    System.out.println("Flowers in certain stem range:");
    BouquetAction.findFlowersByStemLengthRange(bouquet, 0.3, 0.5).forEach(System.out::println);

    System.out.println("Flowers sorted by freshness level:");
    BouquetAction.sortFlowersByFreshnessLevel(bouquet).getFlowerList().forEach(System.out::println);

  }

}

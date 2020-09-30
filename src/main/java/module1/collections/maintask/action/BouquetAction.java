package module1.collections.maintask.action;

import module1.collections.maintask.model.Bouquet;
import module1.collections.maintask.model.Flower;
import module1.collections.maintask.model.FlowerAccessory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BouquetAction {

    public static Bouquet sortFlowersByFreshnessLevel(Bouquet bouquet) {
        bouquet.getFlowerList().sort(Comparator.comparingInt(Flower::getFreshnessLevel));
        return bouquet;
    }

    public static List<Flower> findFlowersByStemLengthRange(Bouquet bouquet, double minLength, double maxLength) {
        List<Flower> flowersInRange = new ArrayList<>();
        for (Flower flower : bouquet.getFlowerList()) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                flowersInRange.add(flower);
            }
        }
        return flowersInRange;
    }

    public static void calculateBouquetPrice(Bouquet bouquet) {
        double totalPrice = 0;
        for(Flower flower : bouquet.getFlowerList()) {
            totalPrice += (flower.getPrice() * flower.getAmount());
        }
        for(FlowerAccessory flowerAccessory : bouquet.getFlowerAccessoryList()){
            totalPrice += (flowerAccessory.getPrice() * flowerAccessory.getAmount());
        }
        bouquet.setPrice(totalPrice);
    }

}

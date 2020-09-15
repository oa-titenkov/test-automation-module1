package module1.collections.maintask.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Bouquet {

    private int id;
    private List<Flower> flowerList;
    private List<FlowerAccessory> flowerAccessoryList;
    private double bouquetPrice;

    public Bouquet(int id, List<Flower> flowerList, List<FlowerAccessory> flowerAccessoryList) {
        this.id = id;
        this.flowerList = flowerList;
        this.flowerAccessoryList = flowerAccessoryList;
        this.calculatePrice();
    }

    public Bouquet sortFlowersByFreshnessLevel() {
        flowerList.sort(Comparator.comparingInt(Flower::getFreshnessLevel));
        return this;
    }

    public List<Flower> findFlowersByStemLengthRange(double minLength, double maxLength) {
        List<Flower> flowersInRange = new ArrayList<>();
        for (Flower flower : this.getFlowerList()) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                flowersInRange.add(flower);
            }
        }
        return flowersInRange;
    }

    private void calculatePrice() {
        double totalPrice = 0;
        for(Flower flower : this.flowerList) {
            totalPrice += (flower.getPrice() * flower.getAmount());
        }
        for(FlowerAccessory flowerAccessory : this.flowerAccessoryList){
            totalPrice += (flowerAccessory.getPrice() * flowerAccessory.getAmount());
        }
        this.bouquetPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public List<FlowerAccessory> getFlowerAccessoryList() {
        return flowerAccessoryList;
    }

    public void setFlowerAccessoryList(List<FlowerAccessory> flowerAccessoryList) {
        this.flowerAccessoryList = flowerAccessoryList;
    }

    public double getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(double bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return id == bouquet.id &&
                Double.compare(bouquet.bouquetPrice, bouquetPrice) == 0 &&
                Objects.equals(flowerList, bouquet.flowerList) &&
                Objects.equals(flowerAccessoryList, bouquet.flowerAccessoryList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, flowerList, flowerAccessoryList, bouquetPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bouquet id: ").append(id).append("\n");
        sb.append("Flower list:\n");
        for(Flower flower : flowerList) {
            sb.append(flower.toString()).append("\n");
        }
        sb.append("Accessory list:\n");
        for(FlowerAccessory accessory : flowerAccessoryList) {
            sb.append(accessory.toString()).append("\n");
        }
        sb.append("Total price: ").append(bouquetPrice);
        return sb.toString();
    }

}

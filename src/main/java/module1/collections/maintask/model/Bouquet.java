package module1.collections.maintask.model;

import module1.collections.maintask.action.BouquetAction;

import java.util.List;
import java.util.Objects;

public class Bouquet {

    private int id;
    private List<Flower> flowerList;
    private List<FlowerAccessory> flowerAccessoryList;
    private double price;

    public Bouquet(int id, List<Flower> flowerList, List<FlowerAccessory> flowerAccessoryList) {
        this.id = id;
        this.flowerList = flowerList;
        this.flowerAccessoryList = flowerAccessoryList;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return id == bouquet.id &&
                Double.compare(bouquet.price, price) == 0 &&
                Objects.equals(flowerList, bouquet.flowerList) &&
                Objects.equals(flowerAccessoryList, bouquet.flowerAccessoryList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, flowerList, flowerAccessoryList, price);
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
        BouquetAction.calculateBouquetPrice(this);
        sb.append("Total price: ").append(price);
        return sb.toString();
    }

}

package module1.collections.maintask;

import java.util.List;
import java.util.Objects;

public class Bouquet {

  private int id;
  private List<Flower> flowerList;
  private List<FlowerAccessory> flowerAccessoryList;
  private double bouquetPrice;

  Bouquet(int id, List<Flower> flowerList, List<FlowerAccessory> flowerAccessoryList, double bouquetPrice) {
    this.id = id;
    this.flowerList = flowerList;
    this.flowerAccessoryList = flowerAccessoryList;
    this.bouquetPrice = bouquetPrice;
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
    return "Bouquet{" +
            "id=" + id +
            ", flowerList=" + flowerList +
            ", flowerAccessoryList=" + flowerAccessoryList +
            ", bouquetPrice=" + bouquetPrice +
            '}';
  }

}

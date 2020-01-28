package module1.collections.maintask;

import java.util.Objects;

public class Flower {

  private int id;
  private String name;
  private double price;
  private double stemLength;
  private int freshnessLevel;
  private int amount;

  Flower(int id, String name, double price, double stemLength, int freshnessLevel) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.stemLength = stemLength;
    this.freshnessLevel = freshnessLevel;
  }

  Flower(int id, String name, double price, double stemLength, int freshnessLevel, int amount) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.stemLength = stemLength;
    this.freshnessLevel = freshnessLevel;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getStemLength() {
    return stemLength;
  }

  public void setStemLength(double stemLength) {
    this.stemLength = stemLength;
  }

  public int getFreshnessLevel() {
    return freshnessLevel;
  }

  public void setFreshnessLevel(int freshnessLevel) {
    this.freshnessLevel = freshnessLevel;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Flower flower = (Flower) o;
    return id == flower.id &&
            Double.compare(flower.price, price) == 0 &&
            Double.compare(flower.stemLength, stemLength) == 0 &&
            freshnessLevel == flower.freshnessLevel &&
            Objects.equals(name, flower.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, price, stemLength, freshnessLevel);
  }

  @Override
  public String toString() {
    return "Flower{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", stemLength=" + stemLength +
            ", freshnessLevel=" + freshnessLevel +
            ", amount=" + amount +
            '}';
  }

}

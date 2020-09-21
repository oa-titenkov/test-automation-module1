package module1.collections.maintask.model;

import java.util.Objects;

public class Flower extends ShopItem {

  private double stemLength;
  private int freshnessLevel;

  public Flower(int id, String name, double price, double stemLength, int freshnessLevel, int amount) {
    super(id, name, price, amount);
    this.stemLength = stemLength;
    this.freshnessLevel = freshnessLevel;
    this.amount = amount;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Flower flower = (Flower) o;
    return Double.compare(flower.stemLength, stemLength) == 0 &&
            freshnessLevel == flower.freshnessLevel;
  }

  @Override
  public int hashCode() {
    return Objects.hash(stemLength, freshnessLevel);
  }

  @Override
  public String toString() {
    return "Flower{" +
            "stemLength=" + stemLength +
            ", freshnessLevel=" + freshnessLevel +
            ", id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", amount=" + amount +
            '}';
  }
}

package module1.collections.maintask;

import java.util.Objects;

public class FlowerAccessory {

  private int id;
  private String name;
  private double price;
  private int amount;

  FlowerAccessory(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  FlowerAccessory(int id, String name, double price, int amount) {
    this.id = id;
    this.name = name;
    this.price = price;
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
    FlowerAccessory that = (FlowerAccessory) o;
    return id == that.id &&
            Double.compare(that.price, price) == 0 &&
            Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, price);
  }

  @Override
  public String toString() {
    return "FlowerAccessory{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", amount=" + amount +
            '}';
  }
}

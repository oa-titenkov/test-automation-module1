package module1.collections.maintask.model;

public class FlowerAccessory extends ShopItem {


    public FlowerAccessory(int id, String name, double price, int amount) {
        super(id, name, price, amount);
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

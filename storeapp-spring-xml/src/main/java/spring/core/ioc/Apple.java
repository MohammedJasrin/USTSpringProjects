package spring.core.ioc;
public class Apple implements Comparable<Apple> {
    private int id;
    private String species;
    private int qty;
    private int price;

    public Apple(int id, String species, int qty, int price) {
        this.id = id;
        this.species = species;

        this.qty = qty;

        this.price = price;
    }


    @Override
    public String toString() {
        return "Chocolate{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Apple o) {
        return this.species.compareTo(o.species);
    }
}

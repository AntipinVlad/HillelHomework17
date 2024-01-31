public class Bank {
    public String name;
    public double price;


    public Bank(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

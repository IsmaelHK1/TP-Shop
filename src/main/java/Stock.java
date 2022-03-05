public class Stock {

    public int id;
    public String name;
    public double price;
    public int count;
    public boolean onShelf;
    public Stock[] stock;

    public void Item(int id, String name, double price, int count, boolean onShelf) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.onShelf = onShelf;
    }

}

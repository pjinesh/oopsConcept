public class Item {
    String name;
    int sku;
    double price;
    int qty;

    public Item() {
    }

    public Item(String name, int sku, double price, int qty) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.qty = qty;
        Bill();
    }

    public void Bill() {
        System.out.println("+-----------------Bill-----------------+");
        System.out.println("Item Name" + "    SKU" + "    Price" + "   Quantity");
        System.out.println(name + "        " + sku + "    " + price + "      " + qty);
        System.out.println("+--------------------------------------+");
    }

    public static void main(String[] args) {
        Item Apple = new Item("Apple", 1101, 50, 3);
    }

}

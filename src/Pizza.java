public class Pizza {
    String name, topping;
    char size;
    double price;
    public Pizza(){    }

    public Pizza(String name, String topping, char size, double price){
        this.name=name;
        this.price=price;
        this.size=size;
        this.topping=topping;
        Bill();
    }

    public void Bill(){
        System.out.println("+-----------------Bill-----------------+");
        System.out.println("Name" +"     Topping "+"  size"+"  price");
        System.out.println(name+"    "+topping+"    "+size+"    "+price);
        System.out.println("+--------------------------------------+");
    }

    public static void main(String[] args) {
        Pizza Jin = new Pizza("Jinesh","Olives", 'M',100);
    }
}

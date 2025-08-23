class Mobile {

    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class DemoS {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1700;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1500;
        obj2.name = "Smartphone";

        obj1.name = "Phone";

        obj1.show();  // Apple : 1700 : Phone
        obj2.show();  // Samsung : 1500 : Smartphone
    }
}

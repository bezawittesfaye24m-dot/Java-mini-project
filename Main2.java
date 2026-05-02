// Superclass
class Food {
    String name;
    double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void make() {
        System.out.println(name + " is being prepared...");
    }

    void showFood() {
        System.out.println(name + " costs " + price);
    }
}

// Subclass 1
class Burger extends Food {

    Burger(String name, double price) {
        super(name, price);
    }

    void make() {
        System.out.println(name + " is grilled and ready ");
    }

    void addSauce() {
        System.out.println("Adding special burger sauce ");
    }
}

// Subclass 2
class Pizza extends Food {

    Pizza(String name, double price) {
        super(name, price);
    }

    void make() {
        System.out.println(name + " is baked in oven and ready ");
    }

    void addCheese() {
        System.out.println("Extra pizza cheese added ");
    }
}

// Interface
interface Order {
    void placeOrder();
}

// Customer class
class Customer implements Order {
    String name;
    String location;

    Customer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void placeOrder() {
        System.out.println(name + " placed an order to " + location);
    }
}

// Main class 
public class Main2 {
    public static void main(String[] args) {

        // Polymorphism
        Food f1 = new Burger("Chicken Burger", 2300);
        Food f2 = new Pizza("Cheese Pizza", 1800);

        f1.make();
        f2.make();

        f1.showFood();
        f2.showFood();

        // Child-specific methods
        Burger b = new Burger("Chicken Burger", 2300);
        b.addSauce();

        Pizza p = new Pizza("Cheese Pizza", 1800);
        p.addCheese();

        // Interface usage
        Customer c = new Customer("Mihret", "Bole");
        c.placeOrder();

        // final keyword
        final double tax = 0.15;
        System.out.println("Tax: " + tax);
    }
}

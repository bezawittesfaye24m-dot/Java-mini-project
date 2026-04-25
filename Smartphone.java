// Child Class
public class Smartphone extends ElectronicProduct {
    int storage = 128;
    int ram = 6;

    public static void main(String[] args) {

        Smartphone myPhone = new Smartphone();

        // Change the name inherited from parent
        myPhone.name = "Galaxy S24";

        // Accessing Parent and Child features
        myPhone.turnOn();
        System.out.println("Model: " + myPhone.name);
        System.out.println("storage: " + myPhone.storage + "GB Storage, " + myPhone.ram + "GB RAM");
        System.out.println("Price: $" + myPhone.price);
    }
}
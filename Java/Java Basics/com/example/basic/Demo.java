class Mobile{
    String brand;
    int price;
    String name;
    static String battery = "Li-Ion 4323 mAh";

    public Mobile() {
        System.out.println("Constructor executed");
    }

    public static void displayBattery() {
        System.out.println("Battery: " + battery); 
        // displayDetails(); // cannot call non-static method from static context
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    static {
        System.out.println("Static block executed");
        battery = "Li-Ion 5000 mAh"; // Modifying static variable in static block
    }
}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException{
        // Mobile m1 = new Mobile();
        // m1.brand = "Apple";
        // m1.price = 100000;
        // m1.name = "iPhone 14 Pro Max";
        // // Mobile.battery = "Li-Ion 4323 mAh";

        // Mobile m2 = new Mobile();
        // m2.brand = "Samsung";
        // m2.price = 90000;
        // m2.name = "Galaxy S23 Ultra";

        // System.out.println(m1.brand + " " + m1.price + " " + m1.name + " " + Mobile.battery);
        // System.out.println(m2.brand + " " + m2.price + " " + m2.name + " " + Mobile.battery);

        // Mobile.displayBattery();
        Class.forName("Mobile"); // This will trigger the static block of Mobile class
    }
}

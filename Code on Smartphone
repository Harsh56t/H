// Abstract class representing a generic phone
abstract class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    // Concrete method to display phone information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
     public abstract void makeCall(String phoneNumber);
}

// Concrete subclass representing a Smartphone
class Smartphone extends Phone {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber + " on the smartphone.");
    }
}

// Concrete subclass representing a Basic Phone
class BasicPhone extends Phone {
    public BasicPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber + " on the basic phone.");
    }
}

public class abstruct {
    public static void main(String[] args) {
        // Create instances of Smartphone and BasicPhone
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");
        BasicPhone basicPhone = new BasicPhone("Nokia", "3310");

        // Call the makeCall method for each phone
        smartphone.makeCall("4766414161");
        basicPhone.makeCall("9875514871");

        // Display phone information
        smartphone.displayInfo();
        basicPhone.displayInfo();
    }
}

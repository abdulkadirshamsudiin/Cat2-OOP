// Question 2(a) - Abstraction Example

abstract class Appliance {
    // abstract method
    abstract void turnOn();
}

// First subclass
class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan is now running.");
    }
}

// Second subclass
class TV extends Appliance {
    void turnOn() {
        System.out.println("TV is now on.");
    }
}

// Main class
public class TestAppliance {
    public static void main(String[] args) {
        // Create objects
        Fan f = new Fan();
        TV t = new TV();

        // Call turnOn() on both
        f.turnOn();
        t.turnOn();
    }
}

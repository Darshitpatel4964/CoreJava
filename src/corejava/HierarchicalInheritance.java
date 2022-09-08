package corejava;

/**
 * write a program of hierarchical inheritance.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

//Two or More Class Inherits a single class
class Vehicle {
    double basePrice = 100000;
    public void showPrice() {
        System.out.println("The price of Vehicle is: Rs." + basePrice);
    }
}

class TwoWheeler extends Vehicle {
    double increasePriceBy = 0.20;
    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println("After modification, The price of bike is: Rs." + basePrice);
    }
}

class FourWheeler extends Vehicle {
    double increasePriceBy = 1;
    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println("After modification, The price of car is: Rs." + basePrice);
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        FourWheeler car = new FourWheeler();
        bike.showPrice();
        bike.finalPrice();
        car.showPrice();
        car.finalPrice();
    }

}

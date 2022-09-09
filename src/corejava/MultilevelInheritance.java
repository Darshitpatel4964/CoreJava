/**
 * Write a program of multilevel inheritance.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

// Chain Of Inheritance
class Bicycle {
	
    void speed() {
        System.out.println("Bicycle Speed Is");
    }
    
}

class Toyota extends Bicycle {
	
    void avg() {
        System.out.println("Toyota Average Is");
    }
    
}

class Car extends Toyota {
	
    void gear() {
        System.out.println("Car Gear Is");
    }
    
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Car vehical = new Car();
        vehical.speed();
        vehical.avg();
        vehical.gear();
    }

}

/**
 * Write a program to demonstrate the super variable.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Animal {
	
    String color = "white";
}

class Dog extends Animal {
	
    String color = "black";
    void printColor() {
        System.out.println(color); // Prints color of Dog class
        System.out.println(super.color); // Prints color of Animal class
    }
    
}

class SuperVariable {

    public static void main(String args[]) {
        Dog color = new Dog();
        color.printColor();
    }

}
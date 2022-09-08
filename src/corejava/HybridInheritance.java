package corejava;

/**
 * Write a program of hybrid inheritance.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Ability {
    public void show() {
        System.out.println("I am a person, I can speak and run !");
    }
}

interface Moveable {
    public void run();
}

interface Speakable {
    public void speak();
}

class Men extends Ability implements Moveable, Speakable {
    @Override
    public void run() {
        System.out.println("I can run !");
    }

    @Override
    public void speak() {
        System.out.println("I can speak !");
    }
}

public class HybridInheritance {

    public static void main(String[] args) {
        Men obj = new Men();
        obj.run();
        obj.speak();
        obj.show();
    }

}
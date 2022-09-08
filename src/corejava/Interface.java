package corejava;

/**
 * Write a program to demonstrate the interface.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Interface implements Printable, Showable {

    public void print() {
        System.out.println("Darshit");
    }

    public void show() {
        System.out.println("Patel");
    }

    public static void main(String[] args) {
        Interface object = new Interface();
        object.print();
        object.show();
    }

}

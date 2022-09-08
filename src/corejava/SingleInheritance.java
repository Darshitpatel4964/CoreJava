package corejava;

/**
 * Write a program of single inheritance.
 * class Inherit the other Class is call single Inheritance
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

class Worker {
    float salary = 60000;
}

class SingleInheritance extends Worker {
    float bonus = 1500;
    float fixSalary = salary + bonus;
    
    public static void main(String args[]) {
        SingleInheritance object = new SingleInheritance();
        System.out.println("Salary amount is:" + object.salary);
        System.out.println(" Extra Bonous is:" + object.fixSalary);
    }
    
}
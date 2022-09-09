 /**
  * Write a program of Static Variable.
  * @author Darshit Patel
  * @version 1.01 2022-09-07
  */

 class Teacher {
     
	 int rollno; // Instance variable
     String name;
     static String college = "ITS"; // Static variable

     // Constructor
     Teacher(int rno, String nm) {
         rollno = rno;
         name = nm;
     }

     // Method to display the values
     void display() {
         System.out.println(rollno + " " + name + " " + college);
     }

 }

 //Test class to show the values of objects  
 public class StaticVariable {

     public static void main(String args[]) {
         Teacher TeacherOne = new Teacher(1, "Anjali Patel");
         Teacher TeacherTwo = new Teacher(2, "Priya Patel");
         // We can change the college of all objects by the single line of code
         // Student.college="BBDIT";
         TeacherOne.display();
         TeacherTwo.display();
     }

 }

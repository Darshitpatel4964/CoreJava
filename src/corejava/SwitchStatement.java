package corejava;

/**
 * Write a program to find the current month name from the given number of the switch case. 
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class SwitchStatement {

    public static void main(String[] args) {
        // Specifying month number
        int month = 9;
        String monthString = "";
        // Switch statement
        switch (month) {
            // Case statements within the switch block
            case 1:
                monthString = "1 - January";
                break;
            case 2:
                monthString = "2 - February";
                break;
            case 3:
                monthString = "3 - March";
                break;
            case 4:
                monthString = "4 - April";
                break;
            case 5:
                monthString = "5 - May";
                break;
            case 6:
                monthString = "6 - June";
                break;
            case 7:
                monthString = "7 - July";
                break;
            case 8:
                monthString = "8 - August";
                break;
            case 9:
                monthString = "9 - September";
                break;
            case 10:
                monthString = "10 - October";
                break;
            case 11:
                monthString = "11 - November";
                break;
            case 12:
                monthString = "12 - December";
                break;
            default:
                System.out.println("Invalid Month!");
        }
        // Printing month of the given number
        System.out.println(monthString);
    }
    
}
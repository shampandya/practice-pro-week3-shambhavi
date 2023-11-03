package correct_practice_pro;

import java.util.Scanner;

/**
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme2_LeapYear {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int  year = scan.nextInt();
        Programme2_LeapYear obj = new Programme2_LeapYear();
        obj.isItLeapYear(year);
        //closing the scanner object
        scan.close();
    }
    //Checking is it a leap year or not
    public void isItLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year " +year+ " is leap year");
            return;
        }
        System.out.println("The year " +year+ " is not a leap year");
    }

}

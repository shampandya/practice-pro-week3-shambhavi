package correct_practice_pro;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */


public class Prog1_TernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scan.nextInt();
        isItOddOrEvenNumber(number);
        //Closing the scanner object
        scan.close();
    }
    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //Ternary Operator is used
        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The " +number+ "is " +evenOrOdd+ " number");
    }
}

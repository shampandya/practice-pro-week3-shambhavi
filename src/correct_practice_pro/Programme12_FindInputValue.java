package correct_practice_pro;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */


public class Programme12_FindInputValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = scan.next().charAt(0);
        //Object creation
        Programme12_FindInputValue inputValue = new Programme12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scan.close();
    }

    // Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}


package correct_practice_pro;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */


public class Programme3_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name      ");
        String name = scan.next();
        System.out.println("Enter Student Roll Number");
        int rollNo = scan.nextInt();
        System.out.print("Enter Marks of Subject Maths ");
        int mathMarks = scan.nextInt();
        if(mathMarks < 0 || mathMarks > 100) {
            System.out.print("Invalid Input, Marks should be between  0 to 100 ");
            System.out.print("Please enter correct marks: ");
            mathMarks = scan.nextInt();
        }
        System.out.print("Enter Marks of Subject Science");
        int sciMarks = scan.nextInt();
        if (sciMarks < 0 || sciMarks > 100){
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.out.println("Please enter correct marks: ");
            sciMarks = scan.nextInt();
        }
        System.out.println("Enter marks of Subject English: ");
        int engMarks = scan.nextInt();
        if(engMarks < 0 || engMarks > 100){
            System.out.println("Invalid input, marks should be between 0 to 100 ");
            System.out.println("Please enter correct marks : ");
            engMarks = scan.nextInt();
        }
        int total = sum(mathMarks, sciMarks, engMarks);
        int percentage = (total * 100) /300;
        String result = calculateResult(mathMarks, sciMarks, engMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNo, mathMarks, sciMarks, engMarks, total, percentage, result, grade);
        //closing the scanner
        scan.close();
    }
    //calculating the sum
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    //calculating the result on subject marks
    public static String calculateResult(int mathMarks, int sciMarks, int engMarks){
        if(mathMarks < 35 || sciMarks < 35 || engMarks < 35){
            return "fail";
        }else{
            return "pass";
        }
    }
    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result){
        String grade = null;
        if(result.equalsIgnoreCase("pass")){
            if(percentage >= 80){
                grade = "A+";
            }else if (percentage >= 60){
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >=35) {
                grade = "C";
            }
        }else{
            grade = "-";
        }
        return grade;
    }
    //printing the marks sheet
    public static void printTheMarkSheet(String name, int rollNo, int mathMarks, int sciMarks, int engMarks, double total, double percentage, String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNo + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathMarks + "                   |");
        System.out.println("| Science:" + sciMarks + "                |");
        System.out.println("| English:" + engMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }
}

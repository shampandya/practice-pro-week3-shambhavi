package correct_practice_pro;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20%; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */


public class Programme5_SalarySlip {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();

        System.out.println("Enter your Employee Id: ");
        int employeeId = scan.nextInt();

        System.out.println("Enter Basic salary: ");
        double salary = scan.nextDouble();

        //Calculating the Hra, DA, TA, PF
        double hra = calculateHra(salary);
        double da = calculateDa(salary);
        double ta = calculateTa(salary);
        double pf = calculatePf(salary);

        // Calculating the gross salary
        double grossSalary = salary +hra + da +ta - pf;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + salary + "                |");
        System.out.println("|HRA 10%     : " + hra + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scan.close();
    }

    // Calculating HRA
    public static double calculateHra(double salary){
        return (salary * 10) /100;
    }
    // Calculating Da
    public static double calculateDa(double salary){
        return (salary * 8) / 100;
    }
    //Calculating TA
    public  static double calculateTa(double salary){
        return (salary * 9) / 100;
    }
    //Calculating PF
    public static double calculatePf(double salary){
        return (salary * 20) /100;
    }
}



// a program to calculate and display a running total of doubling pennies
// author: Bradley Summers
// date: 09/26/2018

package hw3_pennies_for_pay;
import java.util.Scanner;

public class Hw3_pennies_for_pay {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // scanner for user input
        
        // declare variables
        int days_worked;
        double current_pay = 0.01;
        double total_pay = current_pay;
        
        // display instructions
        System.out.println("For how many days will the pay double? (1-45)");
        System.out.print("> ");
        
        days_worked = input.nextInt(); // get user input for days worked
        
        // check if input is valid
        if(days_worked < 1 || days_worked > 45)
            throw new IllegalArgumentException("Input must be between 1 and 45.");
        
        // display table
        System.out.printf("%n%-6s%21s%n" , "Day" , "Pay");
        System.out.println("---------------------------");
        
        // calculate and display daily pay
        for (int i = 1; i <= days_worked; i++)
        {
            System.out.printf("%-6d$%,20.2f%n" , i, current_pay);
            total_pay += current_pay;      
            current_pay *= 2;
        }
        
        // display total
        System.out.println("---------------------------");
        System.out.printf("%-6s$%,20.2f%n" , "Total", total_pay);
        
    }
}

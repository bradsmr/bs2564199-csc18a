/* Programmer Name: Bradley Summers
 * Assignment Start: 12/5/2018
 * Completion: 12/5/2018
 * Total Hours for Assignment: 1
 * Comments: I'm still struggling with exceptions and try catch blocks, not sure
             when to use which and in what cases.
 */

package bas;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1=January, 2=February, ..., 12=December): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year  = input.nextInt();
        
        MonthDays myMonthDays;
        
        try {            
            myMonthDays = new MonthDays(month,year);            
        }
        catch(IllegalArgumentException e) {
            month = 1;
            myMonthDays = new MonthDays(month,year);
            System.out.println("Invalid input detected for month, value defaulted to January.");            
        }
        
        System.out.printf("%d/%d has %d days.\n",month,year,myMonthDays.getNumberOfDays());
    }
    
}

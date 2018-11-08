/* Programmer Name: Bradley Summers
 * Assignment Start: 11/7/2018
 * Completion: 11/7/2018
 * Total Hours for Assignment: 3
 * Comments: This was a difficult assignment for me, I enjoyed learning how
 *           to use classes and objects
 */

package summers_bradley_monthdays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1=January, 2=February, ..., 12=December): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year  = input.nextInt();
        
        MonthDays myMonthDays = new MonthDays(month,year);
        System.out.printf("%d/%d has %d days.\n",month,year,myMonthDays.getNumberOfDays());
    }
    
}

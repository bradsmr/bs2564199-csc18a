// a program to record / calculated monthly sales tax
// author: Bradley Summers
// date: 09/19/2018

package monthlysalestax;
import java.util.Scanner;
import java.io.PrintStream;

public class MonthlySalesTax {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // scanner to get input
        PrintStream o = System.out; // make 'o' = System.out
        
        String  month;      // month of record
        int     year;       // year of record
        double  sales;      // before tax, will be calculated
        double  totalSales; // including tax; T in the equation
        
        double  stateTax  = .0775; // 7.75% state tax
        double  countyTax = .0145; // 1.45% county tax
        
        // title
        o.println("Monthly Sales Tax Report");
        o.println("========================\n");
        
        // get month input from user
        o.print("Enter month.\n> ");
        month = input.next();
        
        // get year input from user
        o.print("Enter year.\n> ");
        year = input.nextInt();
        
        // get total sales (including tax) from user
        o.print("Enter total income collected. (including taxes)\n> $");
        totalSales = input.nextDouble();
        
        // calculate pre-tax sales
        sales = totalSales / 1.0920;
        
        // display results
        o.println("\nMonth: " + month + ' ' + year);
        o.println("===============================");
        o.printf("%18s %c %,10.2f %n", "Total Collected:"  , '$' , totalSales);
        o.printf("%18s %c %,10.2f %n", "Sales:"            , '$' , sales);
        o.printf("%18s %c %,10.2f %n", "County Sales Tax:" , '$' , sales * countyTax);
        o.printf("%18s %c %,10.2f %n", "State Sales Tax:"  , '$' , sales * stateTax);
        o.printf("%18s %c %,10.2f %n", "Total Sales Tax:"  , '$' ,
                (sales * countyTax) + (sales * stateTax));
    }   
}

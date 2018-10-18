// Programmer Name: Bradley Summers
// Assignment Start: 10/17/2018
// Completion: 10/17/2018
// Total Hours for Assignment: 3
// Comments: I enjoyed learning how to use methods to calculate
//           the standard deviation

package summers.bradley.pkg5.arraystatistics;
import java.util.Scanner;

public class SummersBradley5ArrayStatistics {

    public static void main(String[] args) {
        
        // ask how many values to store in array of doubles
        Scanner input = new Scanner(System.in);
        System.out.print("How many number of the type double do you want to "
                + "store in your array? ");
                
        // create array of doubles to hold # specified above
        int index = input.nextInt();
        double[] myArray = new double[index];
        
        // prompt user to provide value for each index of array until full
        for( int i=0; i < index; i++) {
            System.out.print("Enter a value #" + (i+1) + ": ");
            myArray[i] = input.nextDouble();            
        }
        
        // find min and max of array
        double min = myArray[0]; 
        double max = myArray[0];
        for( int i=0; i < index; i++ ) {
            if( myArray[i] < min )
                min = myArray[i];
            else if( myArray[i] > max )
                max = myArray[i];
        }
        
        // find average of array
        double average = 0;
        for( int i=0; i < index; i++ ) {
            average += myArray[i];
        }        
        average /= index;
        
        // output
        System.out.println("\nThe statistics for your user entered array is:");
        System.out.println("----------------------------------------------\n");
        System.out.printf("%32s %10.3f\n", "Minimum:", min);
        System.out.printf("%32s %10.3f\n", "Maximum:", max);
        System.out.printf("%32s %10.3f\n", "Average:", average);
        System.out.printf("%32s %10.3f\n", "Standard deviation (population):"
                , stddev_pop(myArray));
        System.out.printf("%32s %10.3f\n", "Standard deviation (sample):"
                , stddev_sample(myArray));
    }
    
    public static double stddev_pop(double ...a) {       
        // Find the mean of the data set
        double mean = 0;
        for( int i=0; i < a.length; i++ ) {
            mean += a[i];
        }        
        mean /= a.length;

        // For each data point, find the square of its distance to the mean
        // & find the sum these values       
        double[] b = new double[a.length];
        double sum = 0;        
        for( int i=0; i < a.length; i++ ) {
            b[i] = Math.abs(Math.pow(a[i] - mean, 2));
            sum += b[i];
        }
        
        // Divide the sum by the number of data points and return the sqrt
        return Math.sqrt(sum / a.length);
    }
   
   public static double stddev_sample(double ...a) {       
        // Find the mean of the data set
        double mean = 0;
        for( int i=0; i < a.length; i++ ) {
            mean += a[i];
        }        
        mean /= a.length;

        // For each data point, find the square of its distance to the mean
        // & find the sum these values       
        double[] b = new double[a.length];
        double sum = 0;        
        for( int i=0; i < a.length; i++ ) {
            b[i] = Math.abs(Math.pow(a[i] - mean, 2));
            sum += b[i];
        }
        
        // Divide the sum by the number of data points and return the sqrt
        return Math.sqrt(sum / (a.length - 1));
    }
}

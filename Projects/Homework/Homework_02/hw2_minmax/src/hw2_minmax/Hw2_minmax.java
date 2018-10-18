// a program to display the lowest and highest values for a set of integers
// author: Bradley Summers
// date: 09/21/2018

package hw2_minmax;
import java.util.Scanner;

public class Hw2_minmax {

    public static void main(String[] args) {
        
        int[] integers = new int[4];
        Scanner input = new Scanner(System.in); // scanner to get input
        
        System.out.print("Enter the first integer value:  ");
        integers[0] = input.nextInt();
        System.out.print("Enter the second integer value: ");
        integers[1] = input.nextInt();
        System.out.print("Enter the third integer value:  ");
        integers[2] = input.nextInt();
        System.out.print("Enter the fourth integer value: ");
        integers[3] = input.nextInt();
        
        // calculate min and max
        int integers_min = integers[0]; 
        int integers_max = integers[0];
        for( int i=0; i < integers.length; i++ ) {
            if( integers[i] < integers_min )
                integers_min = integers[i];
            else if( integers[i] > integers_max )
                integers_max = integers[i];
        }
        
        //display results
        System.out.print("The values entered: ");
        for( int i=0; i < integers.length; i++ )
            System.out.print(integers[i] + ", ");
        System.out.print("have a minimum value " + integers_min);
        System.out.println(" and a maximum value " + integers_max);
    }

}

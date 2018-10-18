// a program to evaluate and display perfect numbers
// author: Bradley Summers
// date: 10/10/2018

package perfectnumbers;
import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // scanner to get input
        
        // display instructions & get input
        System.out.print("Enter the largest integer to try to display: ");
        int max = input.nextInt();

        // warning for large numbers
        if(max > 100000) System.out.println("Large number detected! "
                + "Calculation may take a long time.");
        
        // check if every even number until max is perfect, display factors
        for(int i = 2; i <= max; i += 2) {            
            if(isPerfect(i) != null) {
                System.out.println(i + " is perfect.");
                System.out.print("\tFactors:" + isPerfect(i) + '\n');   
            }            
        }
    }
    
    // return a String listing the factors of 'number' if perfect
    public static String isPerfect(int number) {
        
        String S = "";
        int sum = 0;
        
        for(int i=1; i < number; i++) {
            if(number % i == 0) { // if i is a factor, add to the string                 
                S = S + ' ' + i;
                sum += i;
            }
        }
        
        if(sum != number) S = null; // return null if number is not perfect
        return S;
    }
}
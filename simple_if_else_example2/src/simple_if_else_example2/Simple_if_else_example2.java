package simple_if_else_example2;
import java.util.Scanner;

public class Simple_if_else_example2 {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter integer 1 > ");
        int num1 = kb.nextInt();
        System.out.print("Enter integer 2 > ");
        int num2 = kb.nextInt();
        
        if( num2 == 0) {
            System.out.println("Error! Second integer cannot equal 0.");
            System.exit(1);
        }
        else if( num1 % num2 == 0 || num2  %num1 == 0 )
            System.out.println(num1 + " and " + num2 + " are multiples");
        else
            System.out.println(num1 + " and " + num2 + " are not multiples");
    }
    
}

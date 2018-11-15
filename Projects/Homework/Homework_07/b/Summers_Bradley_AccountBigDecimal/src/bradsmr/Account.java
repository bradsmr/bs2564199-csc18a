package bradsmr;
import java.math.BigDecimal;

public class Account
{   
   private String name; // instance variable 
   private BigDecimal balance; // instance variable 

   // Account constructor that receives two parameters  
   public Account(String name, double balance) 
   {
      this.name = name; // assign name to instance variable name
      

      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (balance > 0.0) // if the balance is valid
      {
          BigDecimal _balance = BigDecimal.valueOf(balance); // convert balance to BigDecimal
          this.balance = _balance; // assign it to instance variable balance
      }
      else throw new IllegalArgumentException("Balance must be a nonzero positive number!");
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) 
   {
      if (depositAmount > 0.0) // if the depositAmount is valid
      {
          // convert depositAmount to BigDecimal
          BigDecimal _depositAmount = BigDecimal.valueOf(depositAmount); 
          balance = balance.add(_depositAmount); // add it to the balance
      }
      else throw new IllegalArgumentException("Deposit must be a nonzero positive number!");
   }

   // method returns the account balance
   public BigDecimal getBalance()
   {
      return balance; 
   } 

   // method that sets the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method that returns the name
   public String getName()
   {
      return name; 
   } 
} // end class Account
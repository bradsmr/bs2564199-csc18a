/* Programmer Name: Bradley Summers
 * Assignment Start: 11/14/2018
 * Completion: 11/14/2018
 * Total Hours for Assignment: 3
 * Comments: Learning about BigDecimal was interesting, and a cool challenge
 *           to figure out how to convert the Account class to use it
 */

package bradsmr;

// Driver code
public class main {

    public static void main(String[] args) {
        
        Account myAccount = new Account("Bradley Summers", 1.0);
        myAccount.deposit(.123456789);
        System.out.println(myAccount.getName() + " balance: $" + 
                myAccount.getBalance());
    }

}

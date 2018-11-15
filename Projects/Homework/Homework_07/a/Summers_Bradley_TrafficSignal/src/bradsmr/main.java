/* Programmer Name: Bradley Summers
 * Assignment Start: 11/14/2018
 * Completion: 11/14/2018
 * Total Hours for Assignment: 1
 * Comments: I had trouble figuring out how to assign values to the enum
 *           constants at first, but I figured it out eventually.
 */

package bradsmr;

enum TrafficSignal 
{ 
    RED(60), GREEN(60), YELLOW(6), WALK(10), DONT_WALK(15); 
  
    // declaring private variable for getting values 
    final private int length; 
  
    // getter method 
    public int getLength() 
    { 
        return this.length; 
    } 
  
    // enum constructor
    private TrafficSignal(int length) 
    { 
        this.length = length; 
    } 
}
  
// Driver code 
public class main
{ 
    public static void main(String args[]) 
    { 
        TrafficSignal[] signals = TrafficSignal.values();
        
        for( TrafficSignal signal : signals)
        {
            System.out.printf("%-18s %s %d \n", "signal: " + signal.name(),
                    "length:", signal.getLength());
        }
    } 
} 

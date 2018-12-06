package bas;

public class MonthDays {
    
    // Instance Variables
    private int month;
    private int year;
    
    // Constructor Declaration of Class
    public MonthDays(int month, int year) {
        setMonth(month);
        setYear(year);
    }
    
    // Methods
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12)
            this.month = month;
        else
            throw new IllegalArgumentException();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int getNumberOfDays(){        
        // if Apr, Jun, Sep, Nov -> return 30 days
        if (this.month == 4 || this.month == 6  || this.month == 9 || this.month == 11)
            return 30;
        // if Feb -> check if leap year & return 29 if true, 28 if false
        else if (this.month == 2) {
            if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0))
                return 29;
            else return 28;
        }
        // else -> return 31 days
        else
            return 31;
    }
    
}

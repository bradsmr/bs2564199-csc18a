package bas;

public class Fractions {
    private int numerator;
    private int denominator;

    public int  getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        int g = this.gcd(numerator,this.denominator);
        this.numerator = numerator/g;
    }
    public int  getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        int g = this.gcd(numerator,this.denominator);
        if(denominator != 0)
            this.denominator = denominator/g;
        else
            throw new IllegalArgumentException("Denominator cannot be zero!");
    }
    
    // contructors
    public Fractions() {
        this.numerator   = 0;
        this.denominator = 1;
    }
    public Fractions(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
        int g = this.gcd(numerator,denominator);
    }
    public Fractions(Fractions org) {
        this.setNumerator(org.getNumerator());
        this.setDenominator(org.getDenominator());
    }
    
    @Override
    public String toString(){
        return this.numerator + " / " + this.denominator;
    }
    
    private int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b%a,a);
    }
    
    public Fractions add(Fractions op2){
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        return new Fractions(a*d + b*c, b*d);
    }
    
    public Fractions subtract(Fractions op2) {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        return new Fractions(a*d - b*c, b*d);
    }
    
    public Fractions multiply(Fractions op2) {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        return new Fractions(a*c, b*d);
    }
    
    public Fractions divide(Fractions op2) {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        return new Fractions(a*d, b*c);
    }
    
    public static void main(String[] args) {
    }
}

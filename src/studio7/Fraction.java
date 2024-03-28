package studio7;

public class Fraction {
	
	private double numerator;
	private double denominator;
	
	public Fraction(double initnumerator, double initdenominator) {
		
		numerator = initnumerator;
		denominator = initdenominator;
	}
	
	public double OriginalFraction() {
		
		return (numerator/denominator);
	}
	
	public double Add(double n2, double d2) {
		
		return ( OriginalFraction() ) + (n2/d2);
	}
	
	public double Multiply(double n2, double d2) {
		
		return( OriginalFraction() * (n2/d2));
	}
	
	public double Reciprocal() {
		
		return (denominator/numerator);
	}
	
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction (10.00, 25.00);
		System.out.println(f1.OriginalFraction());
		System.out.println(f1.Add(36.00, 54.00));
		System.out.println(f1.Multiply(36.00, 54.00 ));
		System.out.println(f1.Reciprocal());
	}

}

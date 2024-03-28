package studio7;

public class Complex {
	
	private double a;
	private double bi;
	
	public Complex(double inita, double initbi) {
		
		a = inita;
		bi = initbi;
		
	}
	
	public String Original() {
		
		String temp = "";
		temp += a;
		temp += " + ";
		temp += bi;
		temp += "i";
		return temp;
		
	}
	
	public String Add(double a1, double bi1) {
		
		double real = a + a1;
		double imaginary = bi + bi1;
		
		String temp = "";
		temp += real;
		temp += " + ";
		temp += imaginary;
		temp += "i";
		return temp;
	}
	
	public String Product(double a1, double bi1) {
		
		double real = (a*a1 - bi*bi1);
		double imaginary = (a*bi1 + bi*a1);
		
		String temp = "";
		temp += real;
		temp += " + ";
		temp += imaginary;
		temp += "i";
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex(6.578, 3.48765);
		System.out.println(c1.Original());
		System.out.println(c1.Add(2.45, 9.65801));
		System.out.println(c1.Product(2.45, 9.65801));
		
	}
	
	

}

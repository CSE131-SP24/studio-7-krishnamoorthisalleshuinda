package studio7;

public class Die {
	
	private int n;
	
	public Die(int initn) {
		
		n = initn;
		
	}
	
	public int Roll() {
		
		return (int) (Math.random()*n) + 1;
	}
	
	public static void main(String[] args) {
		
		Die d1 = new Die(6);
		Die d2 = new Die(20);
		System.out.println(d1.Roll());
		System.out.println(d2.Roll());
		
	}


}

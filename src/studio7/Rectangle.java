package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	
	public Rectangle(int initlength, int initwidth) {
		
		length = initlength;
		width = initwidth;
		
	}
	
	/**
	 * 
	 * @param length
	 * @param width
	 * @return Rectangle Area
	 */
	public double Area() {
		
		return length*width;
		
	}
	
	/**
	 * 
	 * @param length
	 * @param width
	 * @return if rectangle is a square
	 */
	public boolean ifSquare() {
		
		if(length==width) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Draw rectangle
	 */
	public void draw() {
		
		
		 for(int i=0; i < length; i++)
	      {
	         for(int j=0; j < width; j++) 
	         {
	             System.out.print("* ");
	             System.out.print("\t");
	          }
	      
	      System.out.println();
	    }
		
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(6, 25);
		Rectangle r2 = new Rectangle(2, 2);
		System.out.println(r1.Area());
		System.out.println(r1.ifSquare());
		r1.draw();
		System.out.println(r2.Area());
		System.out.println(r2.ifSquare());
		r2.draw();
	}

}

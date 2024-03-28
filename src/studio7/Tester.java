package studio7;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(9,3);
		Rectangle r2 = new Rectangle(9.5,10);
		
		//System.out.println(r);
		System.out.println(r.computePerimeter());
		System.out.println(r2.computePerimeter());
		System.out.println(r.isSmaller(r2));
		System.out.println(r2.isSmaller(r));
		//System.out.println(r2); //memory address is printed

		
		Fraction f = new Fraction(2,3);
		System.out.println(f);
		
		Fraction f2 = new Fraction(1,2);
		System.out.println(f.multiply(f2));
		
	}

}

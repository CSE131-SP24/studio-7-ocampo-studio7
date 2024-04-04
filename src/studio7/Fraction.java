package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction multiply(Fraction other) {
		int newNumerator = this.numerator * other.numerator;
		int newDenominator = this.denominator * other.denominator;
		
		return new Fraction(newNumerator, newDenominator);
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	
	
	
	public int getDenominator() {
		return denominator;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
	
	
	
}

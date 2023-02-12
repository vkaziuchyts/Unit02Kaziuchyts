package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		a = 3.5;
		b = 9.33;
		c = 3.14;
		
		double result;
		
		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
		
		System.out.println("result = " + result);

	}

}

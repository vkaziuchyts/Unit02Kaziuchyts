package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		
		double result;
		
		a = 3.5;
		b = 9.33;
		c = 2;
		d = 3.9;
		
		if (c == 0) {
			System.out.println("Знаменатель равен нулю, неопределенность при делении");
	    } else if (d == 0) {  
			System.out.println("Знаменатель равен нулю, неопределенность при делении");
		} else {
			result = ((a / c) * (b / d)) - ((a * b - c) / (c * d));
			System.out.println("result = " + result);
		}
	}
}

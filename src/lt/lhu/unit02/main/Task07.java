package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
				
		double result;
		
		a = 3.3;
		b = -2.0;
		c = 3.9;
				
		if (a < 0) {
			result = Math.pow(a, 4);
			System.out.println("result = " + result);
	    } else {
			result = Math.pow(a, 2);
			System.out.println("result = " + result);
	    }
		if (b < 0) {				
			result = Math.pow(b, 4);
			System.out.println("result = " + result);
		} else {
			result = Math.pow(b, 2);
			System.out.println("result = " + result);
		}	
		if (c < 0) {				
			result = Math.pow(c, 4);
			System.out.println("result = " + result);
		} else {
			result = Math.pow(c, 2);
			System.out.println("result = " + result);
		}
	}
}
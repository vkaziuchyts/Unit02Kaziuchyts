package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		a = 3;
		b = 6;
		c = 4;
		
		double f;
		double z;
		double h;
		
		f = Math.pow(a, 2);
		z = Math.pow((b - c), 2);
		h = Math.log(b * b + 1);
		
		double result;
		
		result = f - z + h;
		
		System.out.println("f = " + f);
		System.out.println("z = " + z);
		System.out.println("h = " + h);
		
		System.out.println("result = " + result);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите значение a");
		double a1 = scan.nextInt();
		System.out.println("Введите значение b");
		double b1 = scan.nextInt();
		System.out.println("Введите значение c");
		double c1 = scan.nextInt();
		
		System.out.println(Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1));
	}
}

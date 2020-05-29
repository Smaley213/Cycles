package by.htp.less.cycles;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {
	public static void Main(String[]args){
		
		int a = 548;
		int b = 843;
		
		while (a > 0) {
			int c = a % 10;
			System.out.println(c);
			a /= 10;
		}
		while (b > 0) {
			int c = b % 10;
			System.out.println(c);
			b /= 10;
		}
		
	} 

}

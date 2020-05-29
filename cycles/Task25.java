package by.htp.less.cycles;

// Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {
	public static void main(String[]args) {
	
			int a = Integer.parseInt("9");
			int f = 1;
			for (int i = 1; i <= a; i++) {
				f *= i;
			}
			System.out.println(f);
		
	}

}

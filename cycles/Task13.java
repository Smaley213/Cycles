package by.htp.less.cycles;

//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.


public class Task13 {
	public static void main(String[] args) {
		double a = -5;
		double b = 5;
		double h = 0.5;
		double y;
		while (a <= b) {
			y = 5 - a * 2 / 2;
			System.out.println(y);
			a = a + h;
		}
	}

}

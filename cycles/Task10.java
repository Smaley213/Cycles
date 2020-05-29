package by.htp.less.cycles;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task10 {
	public static void main(String[] args) {
		
		double i = 1;    //создаем переменные со значениями
		double x = 1;
		double z;
		
		for (; i <= 200; i++) {    // проходим по циклу
			z = x * Math.pow(i, 2);
			
			System.out.println(z);    // Итоги на экран
		}

	}

}

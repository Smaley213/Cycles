package by.htp.less.cycles;

//—оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с шагом h. 
//–езультат представить в виде таблицы, первый столбец которой Ц значени€ аргумента, 
//второй - соответствующие значени€ функции:


public class Task21 {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 9;
		int h = 1;
		double x;
		
		for (int i = a; i <= b; i += h) {
			x = i - Math.sin(i);
			
			System.out.println("«начение аргумента: " + i + " «начение функции: " + x);
		}

	}

}

package by.htp.less.cycles;

public class Task07 {
	public static void main(String[] args) {
		
		int a;   //создаем переменные
		int b;
		int h;
		int x;
		int y;
		
		a = 1;  // даем значения переменным
		b = 5;
		h = 1;
		x = 3;
		
		for(x = a; x <= b; x += h) {  // проходим по циклу
			
			System.out.print("x = " + x + " ");  // инфа на экран
			
			if (x > 2) {    // немного условий
				y = x;
			}
			else {
				y = -x;
			}
			
			System.out.println("y = " + y); // Итоги в консоль
		  }
		}

	}
/*	int a = -3;
int b = 15;
int h = 1;
int c = 3;
int y;
while (a <= b) {
	if (a == 15) {
		y = (a + c) * 2;
		System.out.println(y);
	}else {
		y = (a - c) + 6;
		System.out.println(y);
	}
	a = a + h;
}

*/


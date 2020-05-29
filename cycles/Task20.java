package by.htp.less.cycles;

//  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
// модуль которых больше или равен заданному е. Общий член ряда имеет вид: An = 1 / ((3*n - 2) * (3*n + 1)).

public class Task20 {
	
	public static void main(String[] args) {
	
	double x ;
	double a;       //член ряда An
	double e = -20; //некоторое число е
	double i = 1;
	double y = 0;
	
	
	while(i <= 50) {
		
		a = (1 / ((3 * i - 2) * (3 * i + 1)));
		
		if(Math.abs(a) >= e) {
			
			x = a;
			
			y = y + x;
			
		}
		
		i++;
	}
	
	System.out.println("Сумма членов ряда модуль которых больше или равен е составляет " + y);
	
	
  }

}

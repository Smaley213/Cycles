package by.htp.less.cycles;

//Даны числовой ряд и некоторое число е. 
//Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 


public class Task18 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt("300");     //создаем переменные с значениями
		double e = Math.E;
		double a = 0;
		double sum = 0;
		
		//System.out.println(e);
		
		for (int i = 1; i <= n; i++) {  // цикл проходим 
			
			a = Math.pow(-1, i-1) / i;  // формула выполнения
			//System.out.println(a);
			if (a > 0) {                // условия решения
				
			//System.out.println(sum);
			}else {
				sum += a;
				//System.out.println(sum2);
			}
			
			if ((-sum) >= e) {
				System.out.println("Сумма членов ряда = " + (-sum)); //итоги на экран
			}
		}

	}

}

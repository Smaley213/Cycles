package by.htp.less.cycles;

// С помощью оператора while напишите программу определения суммы всех нечетных чисел в
// диапазоне от 1 до 99 включительно.

public class Task05 {
	public static void main(String[]args){
		
        int a = 1;  // создание переменных и их значения
        int b = 0;
        
        while (a<=99 ){   // тут цикл сравнения
        	
            b = b + a; // формулы решения
            a = a + 2;
        	
            
     System.out.println(b); // вывод в консоль результата
       
      }
   } 

}

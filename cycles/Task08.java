package by.htp.less.cycles;

// ¬ычислить значени€ функции на отрезке [а,b] c шагом h:


public class Task08 {
	public static void main(String[]args){
		
		int x,c;    //создаем переменные
		
		x = 1;  // даем значени€ переменным
		c = 1;
		
		for (int b = 0; x <= b; x = x + c) {  // проходим по циклу
            if (x == 15) {
            	
                System.out.println("y = " + (x + c) * 2);
            } else {
            	
                System.out.println("y = " + (x - c) + 6);  // итоги в консоль
            }
		}
	}

}

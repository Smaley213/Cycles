package by.htp.less.cycles;

//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
//делится на их произведение. Найти эти числа.

public class Task36 {

	public static void main(String[] args) {
		
		for (int i = 10; i < 100; i++) {  //1 цикл проходим
			
			for (int j = 20; j < 100; j++) {  //2 цикл проходим
				
				if (Math.round(((i / 100 + j) * 100)) % (i * j) == 0){  //небольшое условие
					
					System.out.println(i + " " + j); // вывод на экран
				}
			}
		}
		

	}

}

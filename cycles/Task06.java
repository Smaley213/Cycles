package by.htp.less.cycles;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. 
// программа суммирует все числа от 1 до введенного пользователем числа.

public class Task06 {
	public static void main(String[]args){
		
		System.out.print("Введите любое целое положительное число: ");
		
		Scanner scan = new Scanner(System.in);  // принимаем введенное от юзера
		
		int n = scan.nextInt();      // создание переменных и их значения
		int sum = 0;
		
		for (int i=1; i<= n; i++){   // проходим по циклу
			sum = sum + i;
		}
		System.out.println (sum);		// и выводим на экран

		
	}

}

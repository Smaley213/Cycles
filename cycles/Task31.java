package by.htp.less.cycles;

import java.util.Scanner;

public class Task31 {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner (System.in);
		
		for (int i = 1; i <= 5; i++) { 
			
			double t1 = 1 + Math.random() * 15;
			
			System.out.println("Я загадал число между 1 и 15");
			
			System.out.println("Угадай его, введи число: ");
			
			int a1 = scan.nextInt();
			
			if ((int)t1 == a1) System.out.println("Угадал!");
			if ((int)t1 < a1) System.out.println("Взял чуть выше, число было " + (int)t1);
			if ((int)t1 > a1) System.out.println("Взял чуть ниже, число было " + (int)t1);
		}
		
		System.out.println("Попытки кончились!");
		scan.close();
		
		/*
		double t2 = 1 + Math.random() * 15;
		double t3 = 1 + Math.random() * 15;
		double t4 = 1 + Math.random() * 15;
		double t5 = 1 + Math.random() * 15;
		*/
	}

}

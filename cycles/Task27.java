package by.htp.less.cycles;

// ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, 
// ����� ������� � ������ �����. m � n �������� � ����������.

import java.util.Scanner;

public class Task27 {
	
	public static void main(String[] args) { 
		
		System.out.println("������� ����� m: ");
		
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		
		System.out.println("������� ����� n: ");
		int n = scan.nextInt();
		
		for (int i = m; i <= n; i++) {
			
			System.out.print(i + ": ");
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					
					System.out.print("*" + j + " ");
				}
			}
		}

	}

}

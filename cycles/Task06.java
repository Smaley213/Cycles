package by.htp.less.cycles;

import java.util.Scanner;

// �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. 
// ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.

public class Task06 {
	public static void main(String[]args){
		
		System.out.print("������� ����� ����� ������������� �����: ");
		
		Scanner scan = new Scanner(System.in);  // ��������� ��������� �� �����
		
		int n = scan.nextInt();      // �������� ���������� � �� ��������
		int sum = 0;
		
		for (int i=1; i<= n; i++){   // �������� �� �����
			sum = sum + i;
		}
		System.out.println (sum);		// � ������� �� �����

		
	}

}

package by.htp.less.cycles;

import java.util.Scanner;

//��������� ��������� ������������� ������ �� ������� ������������ ��������. 
//� �������� ������� ������� ��������� ������ ����� � ���� �������������. ��������� ������� ����� ����
//�������, ������� � ������ �������������.

public class Task32 {
	public static void main(String[] args) {
		
	    @SuppressWarnings("resource")
		
	    Scanner input = new Scanner(System.in); // ��������� Scanner
	    
	    System.out.println("������� ������ �� ���� � ����: ");
	    
	    if (input.hasNextLine() || input.hasNextInt()) {
	    
	    	System.out.println("�� ����� ����� � �����");
	    }else {
	    	System.out.println("�� ����� ������������ �������");
	    }
	}

}

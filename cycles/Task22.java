package by.htp.less.cycles;

// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � ����� h. 
// ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������, 
// ������ - ��������������� �������� �������:

public class Task22 {
	
	public static void main(String[] args) {
		
		int a = 2; //��������� ����� �������
		int b = 9; //�������� ����� �������
		int h = 1; // ���
		double x;
		
		System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);  // ����� � �������
		
		for (int i = a; i <= b; i += h) {    // ����
			
			x = Math.pow(Math.sin(i), 2);   // ���������� �� �������
			
			System.out.println("�������� ���������: " + i + " �������� �������: " + x);   // ����� � �������
		}

	}

}

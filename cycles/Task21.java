package by.htp.less.cycles;

//��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � ����� h. 
//��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������, 
//������ - ��������������� �������� �������:


public class Task21 {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 9;
		int h = 1;
		double x;
		
		for (int i = a; i <= b; i += h) {
			x = i - Math.sin(i);
			
			System.out.println("�������� ���������: " + i + " �������� �������: " + x);
		}

	}

}

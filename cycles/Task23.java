package by.htp.less.cycles;

// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � ����� h. 
// ��������� ����������� � ���� �������, ������ ������� ������� � �������� ���������, 
// ������ - ��������������� �������� �������:


public class Task23 {
	public static void main(String[] args) {
		
		// ����� �������� ���������� � ���������� � ��� ��������
		
		int a = 2; //��������� ����� �������
		int b = 9; //�������� ����� �������
		int h = 1; // ���
		double f;
		
		  System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);  // ����� � �������
		
		for (int i = a; i <= b; i += h) {  // ���������� ����� 
			
			f = (Math.cos(i / 3) / Math.sin(i / 3)) + (0.5 * Math.sin(i)); // ���������� �� �������
			
			System.out.println("�������� ���������: " + i + " �������� �������: " + f);   // ����� � �������
		}

	}

}

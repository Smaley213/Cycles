package by.htp.less.cycles;

// ��������� ��������� ���������� ������������ ��������� ������ ������� �����.

public class Task10 {
	public static void main(String[] args) {
		
		double i = 1;    //������� ���������� �� ����������
		double x = 1;
		double z;
		
		for (; i <= 200; i++) {    // �������� �� �����
			z = x * Math.pow(i, 2);
			
			System.out.println(z);    // ����� �� �����
		}

	}

}

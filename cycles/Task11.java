package by.htp.less.cycles;

// ��������� ��������� ���������� �������� ����� ������ ������� �����

public class Task11 {
	public static void main(String[] args) {
	
	double i = 1;
	double x = 1;
	double z;
	
	for (; i <= 200; i++) {
		z = Math.pow(x, 3) - Math.pow(i, 3);
		
		System.out.println(z);
	}

  }

}

package by.htp.less.cycles;

// �������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������. ������������� ��� � ������ �����,
//  ����� �������� ����� ��������� � �������� ������� �� ��������� � ��������� ������.

public class Task24 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt("10");
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("����� ������ ����� = " + sum);
		for (int i = a; i > 0; i--) {
			int b = i;
			System.out.println(b);
		}
		
	}

}

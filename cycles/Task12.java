package by.htp.less.cycles;

// ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n >1 
// ��������� ��������� ���������� ������������ ������ 10 ������ ���� ������������������.

public class Task12 {
	public static void main(String[] args) {
		
		int a1 = 1;
		int n = 5;
		int temp = 1;
		
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				a1 = 6 + a1;
				if (i < 10) {
					temp = temp * a1;
					System.out.println(temp);
				}
			}
			
		}else {
			System.out.println("n ������ 1");
		}
	}

}

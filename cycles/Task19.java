package by.htp.less.cycles;

// ���� �������� ��� � ��������� ����� �. 
// ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �.

public class Task19 {
	
	public static void main(String[] args) {
		
		double x;
		double a;//���� ���� An
		double e = -30;//��������� ����� �
		double y = 0;
		double i = 1;
		
		while(i <= 50) {
			
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			
			if(Math.abs(a) >= e) {
				
				x = a;
				
				y = y + x;
				
			}
			
			i++;
		}
		
		System.out.println("����� ������ ���� ������ ������� ������ ��� ����� � ���������� " + y);
		
		System.out.println();
		
		/*
		int n = Integer.parseInt("300");
		double e = Math.E;
		double a = 0;
		double sum = 0;
		
		System.out.println(e);
		for (int i = 1; i <= n; i++) {
			
			a = (1.0 / Math.pow(2, i)) + (1.0 / Math.pow(3, i));
	
			sum += a;
			//System.out.println(sum);
			
			
			if (sum >= e) {
				System.out.println("����� ������ ���� = " + sum);
			}else {
				System.out.println("����� ������ ���� �� ��������� � � = " + sum);
			}
		}
             */
	}

}

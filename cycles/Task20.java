package by.htp.less.cycles;

//  ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,
// ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���: An = 1 / ((3*n - 2) * (3*n + 1)).

public class Task20 {
	
	public static void main(String[] args) {
	
	double x ;
	double a;       //���� ���� An
	double e = -20; //��������� ����� �
	double i = 1;
	double y = 0;
	
	
	while(i <= 50) {
		
		a = (1 / ((3 * i - 2) * (3 * i + 1)));
		
		if(Math.abs(a) >= e) {
			
			x = a;
			
			y = y + x;
			
		}
		
		i++;
	}
	
	System.out.println("����� ������ ���� ������ ������� ������ ��� ����� � ���������� " + y);
	
	
  }

}

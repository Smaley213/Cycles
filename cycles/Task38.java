package by.htp.less.cycles;

//��� ��������� ������������ ����� ����������, �������� �� ��� ����� �������������� ����������. 
//��������������, ��� � ����� �� ����� ��� ����. ��������: 1357, 963.

public class Task38 {
	
	public static void main(String[] args) {
		
		int n = 1436;
		
			int x = n % 10;
			n /= n;
			
			int y = n % 10;
			n /= n;
			
			int z = n % 10;
			int k = n / 10;
			
			if ((x-y) == (y-z) && (y-z)==(z-k)) {
				System.out.println("��");
				
			}else {
				System.out.println("���");
			}


	}

}

package by.htp.less.cycles;

// ������� ��� �������������� �����, ����� ���� ������� �� ������� ����� 15.

public class Task34 {
	
    public static void main(String[] args) {
		
		for (int k = 2000; k < 20000; k++) {
			
		    int a = k % 10; // ��������� �����
		    int b = (k / 10) % 10; // ������ �����
		    int c = (k / 100) % 10; // ������ �����
		    int d = k / 1000; // ������ �����
		    int i = a + b + c + d;
		    if (i == 15) 
		    {
		        System.out.println(k);
		    }
		}

	}


}

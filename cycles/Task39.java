package by.htp.less.cycles;

//� ����������� ����� ���������� ������� �����. 
//����� ���������� ����� �������� �� 7, �� �������� �������� �����. ����� ��� �����.

public class Task39 {
	
	public static void main(String[] args) {
		
		for (int i = 100; i < 1000; i++) {
			
			if ((i % 100) * 7 == i){
				
				System.out.println(i);
			}
		}

	}

}

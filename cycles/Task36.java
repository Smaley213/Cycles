package by.htp.less.cycles;

//��� ���������� �����, ���������� ���� �� ������ , �������� ������������� �����, �������
//������� �� �� ������������. ����� ��� �����.

public class Task36 {

	public static void main(String[] args) {
		
		for (int i = 10; i < 100; i++) {  //1 ���� ��������
			
			for (int j = 20; j < 100; j++) {  //2 ���� ��������
				
				if (Math.round(((i / 100 + j) * 100)) % (i * j) == 0){  //��������� �������
					
					System.out.println(i + " " + j); // ����� �� �����
				}
			}
		}
		

	}

}

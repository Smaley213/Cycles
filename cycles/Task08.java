package by.htp.less.cycles;

// ��������� �������� ������� �� ������� [�,b] c ����� h:


public class Task08 {
	public static void main(String[]args){
		
		int x,c;    //������� ����������
		
		x = 1;  // ���� �������� ����������
		c = 1;
		
		for (int b = 0; x <= b; x = x + c) {  // �������� �� �����
            if (x == 15) {
            	
                System.out.println("y = " + (x + c) * 2);
            } else {
            	
                System.out.println("y = " + (x - c) + 6);  // ����� � �������
            }
		}
	}

}

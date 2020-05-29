package by.htp.less.cycles;

/* �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+, �, /, *). 
��������� ��������� Z � ����������� �� �����. ������������� ������� �� ��������� �������� ���� ��������, 
� ����� �� ���� Y=0 ��� �������. ������������ ����������� ������������ ���������� ��� ������������ 
��������� (�.�. ��������� ����). � �������� ������� ����������� ���������� ������� �0�.
*/
import java.util.Scanner;

public class Task28 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
        System.out.print("������� �������������� ���� ��������: ");
        char arithmeticSign = sc.next().charAt(0);
        
        while (arithmeticSign == '/' || arithmeticSign == '*' || arithmeticSign == '+' || arithmeticSign == '-') {
            System.out.print("������� ������ �������: ");
            int firstNumber = sc.nextInt();
 
            System.out.print("������� ������ �������: ");
            int secondNumber = sc.nextInt();
 
            if (arithmeticSign == '+') {
                int result = firstNumber + secondNumber;
                System.out.println("���������: " + result);
            } else if (arithmeticSign == '-') {
                int result = firstNumber - secondNumber;
                System.out.println("���������: " + result);
            } else if (arithmeticSign == '*') {
                int result = firstNumber * secondNumber;
                System.out.println("���������: " + result);
            } else if (arithmeticSign == '/') {
                int result = firstNumber / secondNumber;
                System.out.println("���������: " + result);
            } else if (arithmeticSign == '/' && secondNumber == 0) {
                System.out.println("������ ������ �� 0!");
 
            }
            if (arithmeticSign != '/' || arithmeticSign != '*' || arithmeticSign != '+' || arithmeticSign != '-') {
                System.out.println("�������� ���� ��������!");
            }else {
            
            if (arithmeticSign == '0') {
                break;
            }
        }
        }
 
        sc.close();
	}


}

package by.htp.less.cycles;

//Найдите количество четных цифр данного натурального числа.


public class Task35 {
	public static void main(String[] args) {
		int n = 8732873;
		while (n != 0) {
			int t = n % 10;
			if (t % 2 == 0) {
				System.out.println(t);
			}
			n /= 10;
		}

	}

}

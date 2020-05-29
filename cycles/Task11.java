package by.htp.less.cycles;

// Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {
	public static void main(String[] args) {
	
	double i = 1;
	double x = 1;
	double z;
	
	for (; i <= 200; i++) {
		z = Math.pow(x, 3) - Math.pow(i, 3);
		
		System.out.println(z);
	}

  }

}

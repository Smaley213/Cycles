package by.htp.less.cycles;

//���������: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {
	public static void main(String[] args) {
		
		int n = 10;
		int sum = 1;
		int p = 1;
		
		for (int i = 2; i <= n; i++) {
			sum += i;
			//System.out.println(sum);
			p *= sum;
			//System.out.println(p);
		}
		System.out.println(p);

	}

}

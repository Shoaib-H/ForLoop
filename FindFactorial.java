package for_Loop;

import java.util.Scanner;

public class FindFactorial {
	Scanner sc = new Scanner(System.in);
	int mul = 1;

	void findFactorial() {
		System.out.println("Enter A Number");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			mul = mul * i;
		}
		System.out.println(mul);
	}

	public static void main(String[] args) {
		FindFactorial f1 = new FindFactorial();
		f1.findFactorial();
	}
}

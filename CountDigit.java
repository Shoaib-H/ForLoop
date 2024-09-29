package for_Loop;

import java.util.Scanner;

public class CountDigit {
	Scanner sc = new Scanner(System.in);
	int count = 0;

	void countDigit(int a) {
		System.out.println("Enter A Digit");
		a = sc.nextInt();

		for (; a > 0;) {
			count++;
			a /= 10;

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		CountDigit c1 = new CountDigit();
		c1.countDigit(0);
	}
}

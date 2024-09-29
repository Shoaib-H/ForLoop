package for_Loop;

import java.util.Scanner;

public class ReverseNumber {
	Scanner sc = new Scanner(System.in);
	int rev = 0;

	void reverseNumber() {
		System.out.println("Enter A Number");
		int a = sc.nextInt();
		for (; a > 0;) {
			int digit = a % 10;
			rev = (rev * 10) + digit;
			a /= 10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		ReverseNumber r1 = new ReverseNumber();
		r1.reverseNumber();
	}
}

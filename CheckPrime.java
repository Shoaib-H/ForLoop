package for_Loop;

import java.util.Scanner;

public class CheckPrime {
	Scanner sc = new Scanner(System.in);
	int count = 0;

	boolean checkPrime() {

		System.out.println("Enter A Number");
		int a = sc.nextInt();
		if (a <= 1) {
			return false;
		}
		for (int i = 1; i < a/2; i++) {
			if (a % i == 0) {
				count++;
				
			}
			if (count == 2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		CheckPrime c1 = new CheckPrime();
		System.out.println(c1.checkPrime());
	}
}

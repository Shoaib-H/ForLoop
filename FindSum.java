package for_Loop;

import java.util.Scanner;

public class FindSum {
	Scanner sc = new Scanner(System.in);

	int sum = 0;

	void findSum() {
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {

			sum = sum + i;

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		FindSum f1 = new FindSum();
		f1.findSum();
	}
}

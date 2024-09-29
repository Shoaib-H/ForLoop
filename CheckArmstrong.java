package com.Logical;

import java.util.Scanner;

public class CheckArmstrong {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter A Number");
		int a = sc.nextInt();
		int temp = a;
		int count = 0;
		int arm = 0;

		while (temp > 0) {
			count++;
			temp /= 10;

		}
		temp = a;
		while (temp > 0) {
			int q = temp % 10;
			arm += Math.pow(q, count);
			temp = temp / 10;
		}

		if (arm == a) {
			System.out.println(a + " is a Armstrong Number");

		} else {
			System.out.println(a + " is not Armstrong Number");

		}
	}
}

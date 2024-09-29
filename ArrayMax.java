package com.Logical;

import java.util.Scanner;

public class ArrayMax {
	int size;
	int[] a;
	int max = 0;
	Scanner sc = new Scanner(System.in);

	void arrayMax() {

		System.out.println("Enter Size of Array");
		size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int k = 0; k < a.length; k++) {
			if (a[k] > max) {
				max = a[k];
			}
		}
		System.out.println("Max Element of Array is " + max);
	}
}

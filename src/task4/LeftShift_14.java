package task4;

import java.util.Scanner;

public class LeftShift_14 {
	Scanner sc = new Scanner(System.in);
	int arr1[] = new int[5];

	void Leftshift(int n) {

		System.out.println("Plase Enter value in array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("origanal array :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i]);
		}

		for (int i = 0; i < n; i++) {
			int first;
			first = arr1[0];
			for (int j = 0; j < arr1.length - 1; j++) {
				arr1[j] = arr1[j + 1];
			}
			arr1[arr1.length - 1] = first;
		}

		System.out.println("\nleftshift array :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i]);
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		LeftShift_14 shift = new LeftShift_14();
		System.out.println("Enter no. of shifting number");
		shift.Leftshift(snr.nextInt());

		snr.close();
	}

}

package task1;

import java.util.Scanner;

public class RightShift_11 {
	Scanner sc = new Scanner(System.in);
	int arr1[] = new int[5];

//	right shift
	void Rightshift(int n) {
		System.out.println("Plase Enter value in array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("origanal array :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i]);
		}

		for (int i = 0; i < n; i++) {
			int last;
			last = arr1[arr1.length - 1];
			for (int j = arr1.length - 1; j > 0; j--) {
				arr1[j] = arr1[j - 1];
			}
			arr1[0] = last;
		}
		System.out.println("\nrightshift array :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(" " + arr1[i]);
		}
	}

	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		RightShift_11 shift = new RightShift_11();
		System.out.println("Enter no. of shifting number");
		shift.Rightshift(snr.nextInt());

		snr.close();
	}
}

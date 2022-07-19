package task6;

import java.util.Scanner;

public class MoveNagetiveOneSide_16 {
	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Please Enter the value in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = snr.nextInt();
		}
		
		int[] positive = new int[arr.length];
		int[] temp = new int[arr.length];
		int j = 0;
		int k = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[j] = arr[i];
				j++;
			} else {
				positive[k] = arr[i];
				k++;
			}
		}
		int z = 0;
		for (int i = k; i < j + k; i++) {
			positive[i] = temp[z];
			z++;
		}

		for (int i = 0; i < positive.length; i++) {
			System.out.print(positive[i] + " ");
		}

		snr.close();
	}
}

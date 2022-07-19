package task7;

import java.util.Scanner;

public class CommanNumberFromTwoArray_17 {
	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		
		System.out.println("Enter the value in first array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = snr.nextInt();
		}
		
		System.out.println("Enter the value in second array");
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = snr.nextInt();
		}
		
		System.out.println("Comman number from arrays");
		for(int i=0;i<arr1.length;i++) {
			for (int j=0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}

	}
}

package task20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Vowels {
	public static void main(String[] args) throws IOException {
		try {
			Scanner snr = new Scanner(System.in);
			System.out.println("Enter Path:");
			BufferedReader br = new BufferedReader(new FileReader(snr.nextLine()));
			int j, counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
			while ((j = br.read()) != -1) {
				if ((char) j == 'a') {
					System.out.println((char) j);
					counta += 1;
				}
				if ((char) j == 'e') {
					System.out.println((char) j);
					counte += 1;
				}
				if ((char) j == 'i') {
					System.out.println((char) j);
					counti += 1;
				}
				if ((char) j == 'o') {
					System.out.println((char) j);
					counto += 1;
				}
				if ((char) j == 'u') {
					System.out.println((char) j);
					countu += 1;
				}
			}

			System.out.println("a:" + counta);
			System.out.println("e:" + counte);
			System.out.println("i:" + counti);
			System.out.println("o:" + counto);
			System.out.println("u:" + countu);
			int counttotal = counta + counte + counti + counto + countu;
			System.out.println("Total Vowels:" + counttotal);

			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found.......");
			e.printStackTrace();
		}
	}
}

package task21;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileFound {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner snr = new Scanner(System.in);
		System.out.println("Enter Path Of Folder:");
		File f = new File(snr.nextLine());
		int count = 0;
		if(f.isDirectory()==true) {
			File[] Files = new File[100];
			Files = f.listFiles();
			for(File f1:Files) {
				if(f1.getName().endsWith(".java")) {
					count++;
				}
			}
			System.out.println("Total Dir.:"+count);
		}
	}
}

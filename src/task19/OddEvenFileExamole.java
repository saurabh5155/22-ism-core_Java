package task19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OddEvenFileExamole {
	
	public static void main(String[] args) throws IOException {
		Scanner snr = new Scanner(System.in);
		try {
			File f = new File("demo2.txt");
			PrintWriter pw  = new PrintWriter(f);

			int[] j  = new int[5];
			
			System.out.println("Enter 5 Number:");
			
			for(int i =0;i<j.length;i++) {
				j[i]=(int) snr.nextInt();
				
					pw.println(j[i]);
			}
			
			File fw = new File("odd.txt");
			File fw1 = new File("even.txt");
			
			pw.flush();
			pw.close();
			PrintWriter pwOdd = new PrintWriter(fw);
			PrintWriter pwEven = new PrintWriter(fw1);
			
			
			BufferedReader bw = new BufferedReader(new FileReader(f));
//			while(true) {
//				String i= bw.readLine();
//				if(i==null) {
//					break;
//				}
//				System.out.println(i);
//			}
			
			
//			String k;
//			while((k=bw.readLine())!=null) {
//				System.out.println(k);
//			}
			
			String k;
			while((k=bw.readLine())!=null) {
				if(Integer.parseInt(k)%2==0) {
					pwOdd.println(Integer.parseInt(k));
				}else {
					pwEven.println(Integer.parseInt(k));
				}
			}
			
			pwEven.close();
			pwOdd.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}

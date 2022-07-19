package task3;

import java.util.Random;
import java.util.Scanner;

public class levis_13 {
	int purchaseId ;
	public levis_13() {
//		purchaseId=(int)(Math.random()*1000);
		Random rnd = new Random();
		purchaseId = rnd.nextInt(10000);
	}
	
	Scanner snr = new Scanner(System.in);
	String name= new String() ;
	int taxCategory;
	int price;
	int student = 0;
	int tax=0;
	float finalAmount;
	int finalTax;
	public void getData() {
		
		System.out.print("Enter Name:");
		name = snr.next();
		
		System.out.print("Enter price:");
		price = snr.nextInt();
		
		
		System.out.println("Enter your gender:");
		System.out.println("1: Male");
		System.out.println("2: Female");
		taxCategory=snr.nextInt();
		switch(taxCategory) {
			case 1:
				tax +=15;
				break;
			case 2:
				tax +=10;
		}
		
		System.out.print("If you are student then press 1:");
		student = snr.nextInt();
		if(student==1) {
			tax -=5;
		}
		
		finalTax  = price*tax/100 ;
		
		finalAmount = price+finalTax;
		
	}
	
	public void print() {
		System.out.println("name\tprice\ttotalTax\tfinalAmount");
		System.out.println(name+"\t"+price+"\t"+finalTax+"\t"+finalAmount);
	}
	public static void main(String[] args) {
		levis_13 obj = new levis_13();
		obj.getData();
		obj.print();
	}
}

package task11;

import java.util.Scanner;

public class InsuranceClaculation_21 {
	String health, city, gender;
	 byte age;
	 Scanner sc = new Scanner(System.in);

	 void input() {
	     System.out.println("for your health\n1: poor\n2:excellent");
	     int n = sc.nextInt();
	     switch (n) {
	         case 1:
	             health = "poor";
	             break;
	         case 2:
	             health = "excellent";
	             break;
	         default:
	             System.out.println("please enter vailid choice");
	             break;
	     }
	     System.out.println("please enter your age");
	     age = sc.nextByte();
	     System.out.println("whare are you from \n1: city\n2:village");
	     int y = sc.nextInt();
	     switch (y) {
	         case 1:
	             city = "city";
	             break;
	         case 2:
	             city = "village";
	             break;
	         default:
	             System.out.println("please enter vailid choice");
	             break;
	     }
	     System.out.println("gender \n1: male\n2:female");
	     y = sc.nextInt();
	     switch (y) {
	         case 1:
	             gender = "male";
	             break;
	         case 2:
	             gender = "female";
	             break;
	         default:
	             System.out.println("please enter vailid choice");
	             break;
	     }
	 }

	 void insurance() {
	     if (age >= 25 && age <= 35) {
	         if (city.equals("city")) {
	             if (health.equals("excellent")) {
	                 if (gender.equals("male")) {
	                     System.out.println("your premium is Rs. 4000 per year");
	                 } else {
	                     System.out.println("your premium is Rs. 3000 per year");
	                 }
	             } else {
	                 System.out.println("you are not insured");
	             }
	         } else {
	             if (gender.equals("male")) {
	                 if (health.equals("poor")) {
	                     System.out.println("your premium is Rs. 6000 per year");
	                 } else {
	                     System.out.println("you are not insured");
	                 }
	             } else {
	                 System.out.println("you are not insured");

	             }

	         }
	     } else {
	         System.out.println("you are not insured");

	     }
	 }

	 public static void main(String[] args) {
	     InsuranceClaculation_21 i = new InsuranceClaculation_21();
	     i.input();
	     i.insurance();

	 }

}

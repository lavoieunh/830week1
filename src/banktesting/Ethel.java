package banktesting;

import java.util.Scanner;


public class Ethel extends Userdat { 

		public static void main(String[] args) {
			
				Userdat ethelsdata = new Userdat();
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter your name");
				ethelsdata.setName(input.nextLine()); 
				System.out.println("Enter your id"); 
				ethelsdata.setId(input.nextLine()); 
				System.out.println("Enter your address");
				ethelsdata.setAddress(input.nextLine()); 
				System.out.println("Enter your city");
				ethelsdata.setCity(input.nextLine());
				System.out.println("Enter your state"); 
				ethelsdata.setAddress(input.nextLine());
				System.out.println("Enter your zipcode");
				ethelsdata.setZipcode(input.nextInt());
				System.out.println("Enter your balance");
				ethelsdata.setBalance(input.nextInt());
				System.out.println("Enter your deposit "); 
				ethelsdata.setDepositamount(input.nextInt());
				double ad = balance + depositamount;
				System.out.println("Your new balance is" + '\n' + ad);
				System.out.println("Enter your withdrawal");
				ethelsdata.setPayamount(input.nextInt());
				double dep = ad - payamount; 
				System.out.println("Your new balance is" + '\n' + dep);
				
				input.close(); }

		}
	
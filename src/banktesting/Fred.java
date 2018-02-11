package banktesting;

import java.util.Scanner;

public class Fred extends Userdat { 

		public static void main(String[] args) {
			
				Userdat fredsdata = new Userdat();
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter your name");
				fredsdata.setName(input.nextLine()); 
				System.out.println("Enter your id"); 
				fredsdata.setId(input.nextLine()); 
				System.out.println("Enter your address");
				fredsdata.setAddress(input.nextLine()); 
				System.out.println("Enter your city");
				fredsdata.setCity(input.nextLine());
				System.out.println("Enter your state"); 
				fredsdata.setAddress(input.nextLine());
				System.out.println("Enter your zipcode");
				fredsdata.setZipcode(input.nextInt());
				System.out.println("Enter your balance");
				fredsdata.setBalance(input.nextInt());
				System.out.println("Enter your deposit");
				fredsdata.setDepositamount(input.nextInt());
				double ad = balance + depositamount;
				System.out.println("Your new balance is" + '\n' + ad);
				System.out.println("Enter your withdrawal");
				fredsdata.setPayamount(input.nextInt());
				double dep = ad - payamount; 
				System.out.println("Your new balance is" + '\n' + dep);
				
				input.close(); }

		}

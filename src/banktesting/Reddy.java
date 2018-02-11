package banktesting;


import java.util.Scanner;


public class Reddy extends Userdat { 

			public static void main(String[] args) {
				
					Userdat reddysdata = new Userdat();
					Scanner input = new Scanner(System.in);
					
					System.out.println("Enter your name");
					reddysdata.setName(input.nextLine()); 
					System.out.println("Enter your id"); 
					reddysdata.setId(input.nextLine()); 
					System.out.println("Enter your address");
					reddysdata.setAddress(input.nextLine()); 
					System.out.println("Enter your city");
					reddysdata.setCity(input.nextLine());
					System.out.println("Enter your state"); 
					reddysdata.setAddress(input.nextLine());
					System.out.println("Enter your zipcode");
					reddysdata.setZipcode(input.nextInt());
					System.out.println("Enter your balance");
					reddysdata.setBalance(input.nextInt());
					double bal = balance; 
					System.out.println("Balance is" + " " + bal);
					System.out.println("Enter your deposit "); 
					reddysdata.setDepositamount(input.nextInt());
					double ad = balance + depositamount;
					System.out.println("Your new balance is" + " " + ad);
					System.out.println("Enter your withdrawal");
					reddysdata.setPayamount(input.nextInt());
					double dep = ad - payamount;
					if (dep >= 0) {
					System.out.println("Your new balance is" + '\n' + dep);
					}
					
					else if (dep <= 0) { 
					System.out.println("You have overdrawn you account" + dep);
					}
					
					input.close(); }

			}
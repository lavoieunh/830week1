package banktesting;

//import java.util.Scanner;

public class Userdat {  
			//
			private String name; 
			private String id; 
			private String address; 
			private String city; 
			private String state; 
			private int zipcode; 
			protected static int balance;
			protected static int payamount; 
			protected static int depositamount;
			protected static int newbalance;
		 		 

			public void setName(String name) {
				this.name = name; 
				
			}  
			public void setId(String id) { 
				this.id = id;
			} 
			
			public void setAddress(String address) { 
				this.address = address; 
			} 
			
			public void setCity(String city) { 
				this.city = city;
			}
			
			public void setState(String state) { 
				this.state = state;
			}
			
			public void setZipcode(int zipcode) { 
			      this.zipcode = zipcode; 
			} 
			
			public void setBalance(int balance) {
				this.balance = balance;
							}
		
			public void setPayamount(int payamount) {
				this.payamount = payamount;
			}

			public void setDepositamount(int depositamount) {
				this.depositamount = depositamount;
			} 
			
			public void setNewbalance( ) { 
				this.newbalance = depositamount + balance;
						double ad = this.newbalance;
			}
			

}

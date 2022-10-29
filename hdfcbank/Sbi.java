package com.hdfcbank;

public class Sbi implements Rbi {


	

	public void deposite() {
		System.out.println("im overwidden ");		
	}

	
	public void withdrawl() {
		System.out.println("withdrawl in atm");		
	}
	public static void main(String[] args) {

			Sbi i=new Sbi();
			i.deposite();
			i.withdrawl();
			

}
}

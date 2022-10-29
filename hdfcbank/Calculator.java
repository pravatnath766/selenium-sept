package com.hdfcbank;

public class Calculator {

	//public static void main(String[] args) {
		int a=10,b=20,result;
	
		
		public void add()
		{
			result=a+b;
			
			System.out.println("add of a &b is " + result);
			
		}
		public void sub() {
			result=a-b;
			System.out.println( "sub of a & b is"+result);
			
		}
		public static void main(String[] args) {

	
		Calculator c=new Calculator();
		c.add();
		c.sub();
		
				
		
		
		
		
			
		
			
	
		}
		
	

}

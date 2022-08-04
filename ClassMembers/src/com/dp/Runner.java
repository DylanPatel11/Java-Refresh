package com.dp;

import com.dp.customer.Customer;

public class Runner {

	public static void main(String[] args) {
		//instantiating and object
		Customer customerOne = new Customer();
		
		//giving object data value ie setting strings
		customerOne.setFirstName("Dylan");
		customerOne.setSurname("Patel");
		
		//Show what is stored
		System.out.println(customerOne.getFirstName() + " " + customerOne.getSurname());
		//or toString() method on Customer.java
		System.out.println(customerOne);
		
	}
	
	
}

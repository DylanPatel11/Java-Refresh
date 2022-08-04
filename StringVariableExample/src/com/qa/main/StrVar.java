package com.qa.main;


public class StrVar {
	
	// change void method to return the type of data we want to return (return type method)
	public static String printMessage() {
		return "Hello World";
	}
	
	//main method below
	public static void main(String[] args) {
		System.out.println(printMessage()); // have to wrap printMessage() in a print method
		
		
	}

}

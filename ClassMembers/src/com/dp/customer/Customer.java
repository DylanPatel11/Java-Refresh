package com.dp.customer;



public class Customer {
	
	private String firstName;
	private String surname;
	
	//constructor
	public Customer() {
		
	}
	
	//getters and setters
	public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	@Override
	public String toString() {
		return "Customer [firstName: " + firstName + ", surname:" + surname + "]";
	}

   
}

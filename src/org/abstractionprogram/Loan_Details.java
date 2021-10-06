package org.abstractionprogram;

public class Loan_Details extends Bank_Details {
	
	@Override
	public void personal_loan() {
		System.out.println("Personal Loan : 10%");
		
	}
	
	public static void main(String[] args) {
		
		Loan_Details loan = new Loan_Details();
		loan.gold_loan();
		loan.housing_loan();
		loan.personal_loan();
	}

	@Override
	public void gold_loan() {
System.out.println("Gold Loan : 10%");		
	}
	
	

}

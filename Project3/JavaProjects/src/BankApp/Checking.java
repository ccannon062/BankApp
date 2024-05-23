package BankApp;

public class Checking extends Account {

	private int debitCardNum;
	private int debitCardPin;
	
	public Checking(String name, String socialSN, double initDeposit) {
		super(name, socialSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard() {
		debitCardNum = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features" + 
		"\n Debit Card Number: " + debitCardNum +
		"\n Debit Card Pin: " + debitCardPin);
	}

}

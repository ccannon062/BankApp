package BankApp;

public class Savings extends Account{
	
	private int safetyDepBoxID;
	private int safetyDepBoxKey;
	
	public Savings(String name, String socialSN, double initDeposit) {
		super(name, socialSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDeposit();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDeposit() {
		safetyDepBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Savings Account Features: " +
		"\n Safety deposit box ID: " + safetyDepBoxID + 
		"\n Safety Deposit Box Key: " + safetyDepBoxKey);
	}
	
}

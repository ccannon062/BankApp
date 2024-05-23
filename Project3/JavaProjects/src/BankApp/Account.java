package BankApp;

public abstract class Account implements IRate {
	
	private String name;
	private String socialSN;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
	public Account(String name, String socialSN, double initDeposit) {
		this.name = name;
		this.socialSN = socialSN;
		this.balance = initDeposit;
		index++;
		this.accountNumber = setAccountNum();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNum() {
		String lastTwoSN = socialSN.substring(socialSN.length() - 2, socialSN.length());
		int uniqueID = index;
		int randomNum = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSN + uniqueID + randomNum;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		System.out.println("Accrued Interest: " + accruedInterest);
		balance += accruedInterest;
		printBalance();
	}
	
	public void deposit(int amount) {
		balance += amount;
		printBalance();
	}
	
	public void withdrawl(int amount) {
		balance -= amount;
		printBalance();
	}
	
	public void transfer(String location, double amount) {
		balance -= amount;
		System.out.println("Transfering $" + amount + "to " + location);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println("Name: " + name + "\n" +
	"Account Number: " + accountNumber + "\n" +
	"Balance: " + balance +
	"\nRate: " + rate + "%");
	}
	
}

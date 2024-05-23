package BankApp;

import java.util.LinkedList;
import java.util.List;

public class BankApp {
	public static void main(String [] args) {
		List<Account> accounts = new LinkedList<Account>();
		String file = "C:\\Users\\User\\Desktop\\Java Projects\\newBankAccounts.csv";
		List<String[]> newAccHolder = Utilities.CSV.read(file);
		for(String[] accountHolder : newAccHolder) {
			String name = accountHolder[0];
			String socialSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, socialSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, socialSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for(Account acc: accounts) {
			System.out.println("****************\n");
			acc.showInfo();
		}
	}
}

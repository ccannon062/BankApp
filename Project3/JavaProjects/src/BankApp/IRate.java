package BankApp;

public interface IRate {
	default double getBaseRate() {
		return 2.5;
	}
}

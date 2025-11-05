package exam1105;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int withdrawal(int amount) {
		int finalBalance = (amount > balance) ? balance : amount;
		balance -= finalBalance;
		System.out.println(finalBalance + "원이 출금되었습니다.");
		System.out.println("남은 잔고 : " + balance);
		
		return balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다.");
		System.out.println("남은 잔고 : " + balance);
		
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

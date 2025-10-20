package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount("정종훈", "7777-03-1469974", 30000);
		BankAccount test = new BankAccount("test", "test");
		
		System.out.println("Deposit : " + myBankAccount.deposit(50000) + "  /  " + "Balance : " + myBankAccount.getBalance());
		System.out.println("Withdraw : " + myBankAccount.withdrawal(30000) + "  /  " + "Balance : " + myBankAccount.getBalance());
		System.out.println("Withdraw : " + myBankAccount.withdrawal(100000) + "  /  " + "Balance : " + myBankAccount.getBalance());
		
		System.out.println(BankAccount.getCount());
	}

}

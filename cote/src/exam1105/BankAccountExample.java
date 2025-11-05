package exam1105;

public class BankAccountExample {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("김태화", "1111-1234");
		bankAccount.deposit(10000);
		bankAccount.withdrawal(5000);
		bankAccount.withdrawal(7000);
	}
}

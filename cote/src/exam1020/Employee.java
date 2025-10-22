package exam1020;

public abstract class Employee {
	protected String name;
	protected String employeeId;
	
	protected Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public abstract int calculatePay();
}

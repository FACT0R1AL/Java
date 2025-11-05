package exam1105;

public class FullTimeEmployee extends Employee{
	public int annualSalary;
	
	public int calculatePay() {
		return annualSalary / 12;
	}
}

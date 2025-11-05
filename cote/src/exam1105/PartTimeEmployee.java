package exam1105;

public class PartTimeEmployee extends Employee{
	public int hourlyRate;
	public int workHours;
	
	@Override
	public int calculatePay() {
		return hourlyRate * workHours;
	}
}

package exam1020;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		
		emps[0] = new FullTimeEmployee("정종훈", "1111", 36000000);
		emps[1] = new PartTimeEmployee("걱걱", "2222", 15000, 120);
		
		for (int i=0; i<2; i++) {
			System.out.println(emps[i].name + "의 이번달 월급은 " + emps[i].calculatePay() + "원");
		}
	}

}

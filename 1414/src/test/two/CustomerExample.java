package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("A", "010-1234-5678");
		Customer cust2 = new Customer("B", "010-9876-5432", 100);
		
		System.out.println(cust1.updatePoint(50));
		System.out.println(cust2.updatePoint(-50));
		System.out.println(cust2.setPoint(200));
	}

}

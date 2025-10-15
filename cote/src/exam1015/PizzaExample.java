package exam1015;

import java.util.Scanner;

public class PizzaExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuIdx = sc.nextInt();
		String size = sc.next();
		
		Pizza p = null;
		
		if (menuIdx == 1) {
			p = new CheesePizza(size);
		}
		else if (menuIdx == 2) {
			p = new PepperoniPizza(size);
		}
		else if (menuIdx == 3) {
			p = new BulgogiPizza(size);
		}
		
		p.cook();
		p.serve();
	}
}

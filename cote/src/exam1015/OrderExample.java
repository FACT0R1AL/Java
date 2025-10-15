package exam1015;

import java.util.Scanner;

public class OrderExample {
	
	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		
		menus[0] = new Menu("후라이드치킨", 20000);
		menus[1] = new Menu("양념치킨", 22000);
		menus[2] =  new Menu("마늘치킨", 22000);
		
		Scanner sc = new Scanner(System.in);
		int menuIdx = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		if (menuIdx >= 0 && menuIdx < menus.length && quantity > 0) {
			OrderItem oi = new OrderItem(menus[menuIdx], quantity);
			System.out.println(oi.getPrice());
		}
	}
}

package exam1105;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("타이레놀", 5000);
		menus[1] = new Menu("타민블루", 10000);
		menus[2] = new Menu("알약", 3000);
		
		OrderItem order = new OrderItem(menus[0], 2);
		System.out.println(order.getPrice());
	}

}

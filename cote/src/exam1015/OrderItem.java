package exam1015;

public class OrderItem{
	public Menu menuInfo;
	public int quantity;
	
	public OrderItem(Menu menu, int quantity) {
		this.menuInfo = menu;
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return menuInfo.price * quantity;
	}
}

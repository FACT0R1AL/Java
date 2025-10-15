package exam1015;

public class CheesePizza extends Pizza{
	public CheesePizza() {
		this("M");
	}
	public CheesePizza(String size) {
		this.size = size;
		this.name = "치즈피자";
		prices = new int[] {20000, 22000, 24000};
	}
}

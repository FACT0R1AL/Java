package exam1015;

public class BulgogiPizza extends Pizza{
	public BulgogiPizza() {
		this("M");
	}
	public BulgogiPizza(String size) {
		this.size = size;
		this.name = "불고기피자";
		this.prices = new int[] {22000, 24000, 26000};
		this.topping = "불고기";
	}
	
	@Override
	public void cook() {
		System.out.println(topping + "를 추가합니다.");
		super.cook();
	}
}

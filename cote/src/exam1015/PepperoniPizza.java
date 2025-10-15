package exam1015;

public class PepperoniPizza extends Pizza{
	public PepperoniPizza() {
		this("M");
	}
	public PepperoniPizza(String size) {
		this.size = size;
		this.name = "페퍼로니피자";
		prices = new int[] {21000, 23000, 25000};
		topping = "페퍼로니";
	}
	
	@Override
	public void cook() {
		System.out.println(topping + "를 추가합니다");
		super.cook();
	}
}

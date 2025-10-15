package exam1015;

public abstract class Pizza {
	public String name;
	public int[] prices;
	public String size;
	public String topping;
	
	public void cook() {
		System.out.println(name + "[" + size + "]" + "를 조리합니다.");
		System.out.println(name + "[" + size + "]" +  "이 완성되었습니다.");
	}
	
	public void serve() {
		int price = 0;
		
		switch(size) {
			case "S": price = prices[0]; break;
			case "M": price = prices[1]; break;
			case "L": price = prices[2]; break;
		}
		
		System.out.println(name + "[" + size + "]" + "를 드립니다.");
		System.out.println("가격 : " + price + "원");
	}
	
	
}

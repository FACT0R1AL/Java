package exam1020;

public class TireExample {

	public static void main(String[] args) {
		Tire[] tires = new Tire[5];
		
		tires[0] = new Tire("타이어", 11);
		tires[1] = new Tire("타이엄", 13);
		tires[2] = new WideTire("타이이이이어", 25, 12);
		tires[3] = new ColorTire("반짝반짝타이어", 7, "노랑");
		
		
		for (int i=0; i<13; i++) {
			for (int j=0; j<tires.length; j++) {
				if (tires[j] != null) {
					if(tires[j].roll() == true) {
						System.out.println("남은 " + tires[j].name + " : " + (tires[j].maxRotation - tires[j].currentRotation));
					}
				}
			}
		}
	}

}

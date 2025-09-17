package sec05.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// speed = 60;	<-- 에러
		// run();    <-- 에러남
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}

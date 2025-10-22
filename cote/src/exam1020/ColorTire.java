package exam1020;

public class ColorTire extends Tire{
	public String color;
	
	public ColorTire(String name, int maxRotation, String color) {
		super(name, maxRotation);
		this.color = color;
	}
}

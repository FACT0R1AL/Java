package exam1020;

public class Tire {
	public String name;
	public int maxRotation;
	public int currentRotation = 0;
	
	public Tire(String name, int maxRotation) {
		this.name = name;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		currentRotation++;
		
		if (currentRotation > maxRotation) return false;
		else return true;
	}
}

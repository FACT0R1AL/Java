package sec01.exam10;

public class ClassExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("Hammer.png").getPath();
		
		System.out.println(photo1Path);
	}

}

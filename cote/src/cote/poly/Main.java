package cote.poly;

public class Main {

	public static void main(String[] args) {
		Animal[] myAnimals = new Animal[5];
		
		myAnimals[0] = new Cat();
		myAnimals[1] = new Dog();
		myAnimals[2] = new Pig();
		myAnimals[3] = new Cat();
		myAnimals[4] = new Pig();
		
		for (Animal a : myAnimals) {
			System.out.println(a.hello());
		}
	}

}

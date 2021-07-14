package dz1;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("fish", "blac", 4, "Vaska");
		Dog dog1 = new Dog("boun", "grey", 9, "Rex");
		Veterinarian vet = new Veterinarian();
		vet.setName("Ivanov");
		vet.treatment(cat1);
		vet.treatment(dog1);
		System.out.println(vet.toString());
		System.out.println(cat1.getVoice());
		cat1.eat();
		cat1.sleep();
		System.out.println(dog1.getVoice());
		dog1.eat();
		dog1.sleep();

	}

}

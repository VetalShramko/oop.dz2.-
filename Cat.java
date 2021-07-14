package dz1;

public class Cat extends Animal {
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
		super();
	}

	@Override
	public String getVoice() {
		return "Meow meow";
	}

	@Override
	public void eat() {
		System.out.println("the cat loves to eat fish");
	}

	@Override
	public void sleep() {
		System.out.println("the cat likes to sleep");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "," + super.toString() + "]";
	}

}

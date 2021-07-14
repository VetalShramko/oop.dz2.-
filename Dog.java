package dz1;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog() {
		super();
	}
	@Override
	public String getVoice() {
		return "WOF WOF";
	}

	@Override
	public void eat() {
		System.out.println("the dog loves to eat bones");
	}

	@Override
	public void sleep() {
		System.out.println("the dog likes to sleep");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "," + super.toString() + "]";
	}

}

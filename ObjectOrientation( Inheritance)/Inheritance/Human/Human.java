package Human;

public class Human {
	
	String name;
	int age;
	float height;
	
	public Human() {
		super();
	}

	public Human(String name, int age, float height) {
		this();
		this.name = name;
		this.age = 12;
		this.height = height;
	}

	public Human(String name) {
		this(name,45);
		this.name = name;
	}

	public Human(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public Human(String name, float height) {
		this("samantaa");
		this.name = name;
		this.height = height;
	}
	
	

}

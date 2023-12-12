package ConstructorChaining;

public class EnggStudent extends Student {
	int marks;
	int sem;
	
	public EnggStudent(String name) {
		super();
		this.name=name;		
	}

	public EnggStudent(String name,int age) {
		super();
		this.name = name;
		this.age = 55;
	}

	public EnggStudent(int marks, int sem, String name,int age) {
		super();
		this.marks = marks;
		this.sem = sem;
		this.name = name;
		this.age = age;
		
	}
	
	
	

}

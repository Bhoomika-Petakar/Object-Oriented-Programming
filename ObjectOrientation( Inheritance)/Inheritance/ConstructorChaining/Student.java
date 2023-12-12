package ConstructorChaining;

public class Student  {
String name;
int age;

public Student() {
	super();
}

public Student(String name, int age) {
	super();
	this.name = name;
	this.age = 30;
}

public Student(String name) {
	super();
	this.name = name;
	age=21;
}


}

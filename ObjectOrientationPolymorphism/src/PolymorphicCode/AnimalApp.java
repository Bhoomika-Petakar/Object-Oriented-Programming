package PolymorphicCode;

public class AnimalApp {
	public static void main(String[] args) {
		Zoo.wildLife(new Tiger());
		System.out.println("************************************");
		Zoo.wildLife(new Deer());
		System.out.println("************************************");
		Zoo.wildLife(new Monkey());
		System.out.println("************************************");
	}
}

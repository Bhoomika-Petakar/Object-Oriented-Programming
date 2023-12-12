package MultiLevelInheritance;

public class CarApp {
	public static void main(String[] args) {
		Sedan sd = new Sedan();
		Car car = new Car();
		Vehicle vh = new Vehicle();
		
		sd.Regno=2234;
		car.Regno=4467;
		vh.Regno=1324;
		
		sd.move();
		car.move();
		vh.move();
	}

}

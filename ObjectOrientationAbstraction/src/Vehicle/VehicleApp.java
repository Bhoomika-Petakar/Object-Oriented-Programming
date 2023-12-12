package Vehicle;

public class VehicleApp {
	public static void main(String[] args) {
		Showroom sh=new Showroom();
		sh.acceptVehicle(new car());
		System.out.println("------------------------");
		sh.acceptVehicle(new Bike());
		System.out.println("------------------------");
		sh.acceptVehicle(new Truck());
		System.out.println("------------------------");

		
	}

}

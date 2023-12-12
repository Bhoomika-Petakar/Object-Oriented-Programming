package DownCasting;

public class PlaneApp {
	public static void main(String[] args) {
		Plane ref;
		ref=new FighterPlane("Bhrmos.....");
		ref.takeOff();
		ref.fly();
		((FighterPlane)ref).carryArms();
	}

}

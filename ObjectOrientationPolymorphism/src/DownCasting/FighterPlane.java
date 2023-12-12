package DownCasting;

public class FighterPlane extends Plane {
	public FighterPlane(String name) {
		this.name=name;
	}
@Override
public void fly() {
	System.out.println(name+"Plane is Flying");
}
public void carryArms() {
	System.out.println(name+"is carrying arms&wepons");
}
}

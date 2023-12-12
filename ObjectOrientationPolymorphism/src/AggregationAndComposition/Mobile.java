package AggregationAndComposition;

public class Mobile {
Os os=new Os(32,"Android");

Charger ref;

public void HasA(Charger ref) {
	this.ref=ref;
	System.out.println(ref.getBrand());
	System.out.println(ref.getColor());
	System.out.println(ref.getType());
}
}

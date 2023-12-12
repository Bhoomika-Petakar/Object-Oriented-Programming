package AggregationAndComposition;

public class MobileApp {
	public static void main(String[] args) {
		Mobile mobile =new Mobile();
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		
		
	Charger c=new Charger("Black","Samsung","Ctype");
	mobile.HasA(c);
	}

}

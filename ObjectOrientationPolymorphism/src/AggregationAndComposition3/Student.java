package AggregationAndComposition3;

public class Student extends Human {
	Book bk;
	public void HasA(Book ref) {
		this.bk=ref;
		System.out.println(bk.getAuthor());
		System.out.println(bk.getName());
		System.out.println(bk.getPrice());
		
	}
	
	Car cr;
	public void HasA(Car cr) {
		this.cr=cr;
		System.out.println(cr.getBrand());
		System.out.println(cr.getColor());
		System.out.println(cr.getCost());
		
	}
	

}

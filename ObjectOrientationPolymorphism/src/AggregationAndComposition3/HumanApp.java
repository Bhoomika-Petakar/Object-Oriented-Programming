package AggregationAndComposition3;

public class HumanApp {
	public static void main(String[] args) {
		Student st=new Student();
		System.out.println("--------Student has a car and book-----------");
	Car c=new Car("TATA","White",1800000);
	st.HasA(c);
	Book b=new Book("Yashwant","Let us see",550);
	st.HasA(b);
	System.out.println("-------- Car Engine Details-----------");
	System.out.println(st.cr.en.getType());
	System.out.println(st.cr.en.getBhp());
	System.out.println("--------Student has a Heart and Brain-----------");
	System.out.println("Student heart : ");
	System.out.println(st.ht.color);
	System.out.println(st.ht.weight);
	System.out.println("Student Brain : ");
	System.out.println(st.bn.color);
	System.out.println(st.bn.weight);
	System.out.println("----------------------------------------------");
			}

}

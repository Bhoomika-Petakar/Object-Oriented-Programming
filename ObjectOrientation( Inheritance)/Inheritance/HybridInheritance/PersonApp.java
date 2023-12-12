package HybridInheritance;

public class PersonApp {
public static void main(String[] args) {
	EngStudent es=new EngStudent();
	BcomStudent cs = new BcomStudent();
	JavaTeacher js = new JavaTeacher();
	TestingTeacher ts = new TestingTeacher();
	
	System.out.println(es.name+" "+cs.name+" "+js.name+" "+ts.name);
}
}

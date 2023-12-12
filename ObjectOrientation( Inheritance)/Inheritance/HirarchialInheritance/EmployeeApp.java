package HirarchialInheritance;

public class EmployeeApp {
	public static void main(String[] args) {
		 Manager mn = new Manager();
		 Developer dv = new Developer();
		 TestEngineer te = new TestEngineer();
		 Teamlead tl = new Teamlead();
		 mn.name="Abhishek";
		 mn.salary=280000;
		 
		 dv.name="Bhoomika";
		 dv.salary=100000;
		 
		 te.name="Rani";
		 te.salary=80000;
		 
		 tl.name="Pallavi";
		 tl.salary=200000;
		 
		 mn.work();
		 dv.work();
		 te.work();
		 tl.work();
	}

}

package onjectCount;

public class objectcount {
	public static void main(String args[])  
	{  
	//creating objects      
	Employee emp1 = new Employee("John", 20000);  
	Employee emp2 = new Employee("Tom", 60000);  
	Employee emp3 = new Employee("Andrew",29000);  
	
	System.out.println ("There are " + Employee.count + " objects in this class.");  
}}

package onjectCount;

public class Employee {
	public String name;  
	public int salary;   
	public static int count=0;  
	
	//creating a constructor of the class  
	Employee(String name, int salary)  
	{  
	this.name= name;  
	this.salary= salary;  
	//increments the variable count by 1  
	count++;  
	} 

}

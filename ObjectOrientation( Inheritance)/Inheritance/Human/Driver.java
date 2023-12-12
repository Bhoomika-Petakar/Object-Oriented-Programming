package Human;

public class Driver extends Human{
	String skill;
	String gender;
	
	
	public Driver() {
		super("Sharat",30,6.0f);
		}
	
	public Driver(String Skill) {
		this();
		this.skill=skill;
	}
	
	public Driver(String skill,String gender) {
		this("Driving without gear car");
		this.skill=skill;
		this.gender=gender;
	}

}

package com.Teacher;

public class TeacherApp {
	public static void main(String[] args) {
		PhysicsTeacher py=new PhysicsTeacher();
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher();
		
		py.name="Shilpa mam";
		py.subject="Physics";
		
		ct.name="Mamata mam";
		ct.subject="Chemistry";
		
		bt.name="Pallavi mam";
		bt.subject="Biology";
		
		py.takeAttendance();
		py.teach();
		py.doLawExp();
		System.out.println("------------------------------------------------------");
		ct.takeAttendance();
		ct.teach();
		ct.chemicalExp();
		System.out.println("------------------------------------------------------");
		bt.takeAttendance();
		bt.teach();
		bt.doDisection();
		System.out.println("------------------------------------------------------");
	}

}

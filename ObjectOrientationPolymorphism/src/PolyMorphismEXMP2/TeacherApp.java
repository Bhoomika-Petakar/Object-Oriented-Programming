package PolyMorphismEXMP2;

public class TeacherApp {
	public static void main(String[] args) {
		Teacher ref;
		ref=new CTeacher();
		ref.takeAttendance();
		ref.teach();
		ref.DoLabExp();
		System.out.println("========================================");
		ref=new JavaTeacher();
		ref.takeAttendance();
		ref.teach();
		ref.DoLabExp();
		System.out.println("========================================");
		ref=new PythonTeacher();
		ref.takeAttendance();
		ref.teach();
		ref.DoLabExp();
		
	}

}


public class Teacher {
 void teach() {
	 System.out.println("teaches subject");
 }
 void takeAttendence() {
	 System.out.println("taking attendence of Students");
 }
}
class PhysicsTeacher extends Teacher{
	void teach() {
		System.out.println("teaches physics");
	}
	void doExperminet() {
		System.out.println("expermenting on physics lab");
	}
}
class chemistryTeacher extends Teacher {
	
	void teach() {
		System.out.println("teaches chemistry ");
	}
	void doExperimment() {
		System.out.println("expermenting on chemistry lab");
	}
}

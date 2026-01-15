
public class mainteach {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.teach();
		t.takeAttendence();
		
		
		System.out.println("-----------------");
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.teach();
		pt.takeAttendence();
		pt.doExperminet();
		
		System.out.println("---------------------");
		
		chemistryTeacher ct = new chemistryTeacher();
		ct.teach();
		ct.takeAttendence();
		ct.doExperimment();
	}

}

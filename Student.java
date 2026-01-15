
public class Student extends Person{
	int roll;

	Student(String name, String nerves, int chambers, int roll){
		super(name,nerves,chambers);
		this.roll=roll;
	}
	
	void Studentdetails() {
		super.persondetails();
		System.out.println("roll number of a student is : " + roll);
	}
	
	void has(book b1,bike b2) {
		b1.bookAuthor();
		b2.bikecc();
	}
}

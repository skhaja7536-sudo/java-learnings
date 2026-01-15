
public class Person {
	String name;
	String department;
	int age;
	
	public Person(String name , String department , int age){
		this.name=name;
		this.department =department;
		this.age =age;
	}
	
	void introduce() {
		System.out.println("my name is " + name + " and i'm from " + department + " department " + age + " years old.");
	}
}

class Student extends Person {
	public Student(String name, String department, int age ,int id , String status) {
		super(name, department, age);
		// TODO Auto-generated constructor stub
	}

	int id;
	String status;
	 
	void Study() {
		System.out.println("it's time to study.");
	}
	
}
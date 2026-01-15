package encaps;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("its my " + roll + " roll number");
		System.out.println("my self " + name);
		System.out.println("i'm " + age + " years old");
	}
	

}

package constructors;

public class employee {
	String name;
	int id;
	String department;
	
	public employee(String name, int id, String department) {
		this.name = name;
		this.id=id;
		this.department=department;
	} 
	
	public void display() {
		System.out.println("Name: " + name + " ID: " + id +  " Department: " + department + ".");
	}

}

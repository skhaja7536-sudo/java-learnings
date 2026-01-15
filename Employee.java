
public class Employee {
	String name;
	int basesalary;
	
	public Employee(String name, int basesalary) {
		super();
		this.name=name;
		this.basesalary=basesalary;
	}
	
	int calculatesalary() {
		return basesalary;
	}
}

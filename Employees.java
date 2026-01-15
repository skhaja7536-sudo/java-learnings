
public class Employees {
	public static void main(String[] args) {
		employee e = new employee("itachi",40000.00);
		e.dispsalary();
		Manager m = new Manager("sasuke",50000.00,15000);
	System.out.println(m.dispsalary());
	}
}

class employee {
	String name;
	double baseSalary;
	
	employee(String name, double salary) {
		this.name= name;
		this.baseSalary=salary;
	}
	double dispsalary() {
		System.out.println("this is the base salary "+ baseSalary + " of employee");
		return baseSalary;
	}
}
class Manager extends employee{
	double bonus;
	
	Manager(String name, double salary,double bonus) {
		super(name,salary);
		this.bonus=bonus;
	}
	
      double dispsalary() {
		System.out.println("the base salary of manager is " + (baseSalary+ bonus));
		return baseSalary+bonus;
	}
	
}

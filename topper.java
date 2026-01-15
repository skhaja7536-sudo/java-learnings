package encaps;

class classmates {
	private int id;
	private String name;
	private int marks;
	
	classmates(int id,String name, int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public int getmarks() {
		return marks;
	}
}

public class topper {
	public static void main(String[] args) {
		classmates s = new classmates(1,"khaja",99);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getmarks());
	}
}
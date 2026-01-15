
public class Person {
	String name;
	Brain b;
	Heart h;
	
	Person(String name,String neurons,int chambers){
		super();
		this.name=name;
		 b = new Brain("trllion");
		 h = new Heart(4);
	}
	void persondetails() {
		System.out.println("name: " + name );
		b.nerves();
		h.pump();
	}
}

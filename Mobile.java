
public class Mobile {
	String brand;
	Os version;
	
	public Mobile(String brand, String name) {
		super();
		this.brand=brand;
		version = new Os(name);
	}
	
	void charge(Charger c) {
		System.out.println("Mobile is charging");
		c.chargerdetils();
	}
	void mobiledetails() {
		System.out.println("Brand Type: " + brand);
	}
}

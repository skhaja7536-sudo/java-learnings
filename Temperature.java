package encaps;

public class Temperature {
	private double celsius;
	private double farhenheit;
	
	public void setcelsius(double c) {
		celsius = c;
	}
	 public double getcelsius() {
		 return celsius;
	 }
	 public double getFarhenheit() {
		 return farhenheit;
	 }
	 public void setFarhenheit(double farhenheit) {
		 this.farhenheit = farhenheit;
	 }
	 
	 public void display() {
		  System.out.println(((celsius * 9)/5)+32);
	 }
	 public void display1() {
		 System.out.println(((farhenheit - 32)*5)/9);
	 }
	 

}

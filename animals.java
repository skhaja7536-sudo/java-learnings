
public class animals {
	public static void main(String[] args) {
		dog d = new dog();
		d.eat();
		d.sleep();
	}
}
class dog extends animal{
	dog(){
		super(10,20);
	}
	void sleep() {
		System.out.println("dog slept after eating");
	}
}
class animal{
	 int a;
	 int b;
	animal(int a, int b){
		this.a=a;
		this.b=b;
	}
	
		void eat() {
			 System.out.println("animals are eating.");
		 }

}
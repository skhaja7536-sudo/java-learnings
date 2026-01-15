package encaps;

public class immutable_class_fully {

	public static void main(String[] args) {
		immutable im = new immutable();
		im.method();
	}

}


final class immutable{
	private final int id =101;
	private final String name="sasuke";
	

	final void  method() {
		System.out.println("whole class is imuteted by making final everythhing,  like class, variable and method\n");
		System.out.println("final class can't be iherited but u can still use its properties and behaviours by creating object\n");
		System.out.println("and final variables need to intilise while declaring itself and it cannot be changed as it is final\n");
		System.out.println("and when it comes to final method u cannot override it but u can still inheriet it and same goes for final variables\n");
	}
}

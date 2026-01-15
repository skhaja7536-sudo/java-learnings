package encaps;

public class Loginmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l = new Login("khaja","@khaja1234");
		System.out.println(l.getusername());
		System.out.println(l.getpassword("b"));
		

	}

}



class Login{
	private String username;
	private String password;
	 
	Login(String username, String pass){
		this.username=username;
		if(pass.length()>8) {
			this.password=pass;
		}else {
			System.out.println("password must be 8 characters,try again");
		}
	}
	
	 public String getusername() {
		return username;
	}
	 
	 public String getpassword(String pass) {
		 return password;
	 }
}









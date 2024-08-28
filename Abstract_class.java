package abstractprograms;

  abstract class Amazon{
	
	
	abstract void login();
	abstract void registration();
	
	
}

public class Abstract_class extends Amazon {
	

	void login() {
		
		System.out.println("User can login");
	}

	
	void registration() {
		System.out.println("User should register");
		
	}
	
	
	static void logout(){
		System.out.println("User logged out");
	}
	
	static void resetPass(){
		System.out.println("User can reset password");
	}
	public static void main(String[] args) {
		Abstract_class ac1 = new Abstract_class();
		ac1.login();
		ac1.registration();
		logout();
		resetPass();
	}

	
	
	

}

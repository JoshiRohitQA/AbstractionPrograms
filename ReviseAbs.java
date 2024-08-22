package abstractprograms;


abstract class Pare{
	
	abstract void te();
	
	void pass() {
		System.out.println("The concrete method of parent");
	}
	
}
public class ReviseAbs extends Pare {
	
	void te() {
		System.out.println("The abstract body in child");
	}
	
	static void loginChild() {
		System.out.println("login child");
	}
	public static void main(String[] args) {
		ReviseAbs re = new ReviseAbs();
		re.te();
		loginChild();
		
	}

}

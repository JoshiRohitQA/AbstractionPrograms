package abstractprograms;


  interface Amazon1{
	 void add();
	 void subtract();
	
}


public class InterfaceProg implements Amazon1{
	

	public void add() {
		
		System.out.println("Add");
	}


	public void subtract() {
		System.out.println("sub");
	}
	
	public static void main(String[] args) {
		InterfaceProg ip = new InterfaceProg();
		ip.add();
		ip.subtract();
		
	}

	

}

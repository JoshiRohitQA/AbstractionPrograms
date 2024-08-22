package abstractprograms;

interface A{
	void add();
	void sub();
	
}

interface B{
	
	void mul();
	void div();
	
}

public class MultipleLevelInheritance implements A,B {
	
public void mul() {
	
		
	System.out.println(Math.multiplyExact(10, 20));
		
	}


	public void div() {
			
		System.out.println(Math.divideExact(10, 20));
		
	}

	
	public void add() {
	
			
		System.out.println(Math.addExact(10, 20));
	}

	
	public void sub() {

			
		System.out.println(Math.subtractExact(10, 20));
		
	}


	
	public static void main(String[] args) {
		
		MultipleLevelInheritance m1 = new MultipleLevelInheritance();
		m1.mul();
		m1.div();
		m1.add();
		m1.sub();
	}

}
	
	

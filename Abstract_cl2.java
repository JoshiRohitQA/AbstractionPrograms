package abstractprograms;

abstract class GrandParent         //abstract class
{
	abstract void add();
	abstract void substraction();
	static void multiply() {
		int a=10;
		int b=20;
		System.out.println(a*b);
		
		
		
	}
	
}

class Parent   extends GrandParent           //concrete class
{
	static void div(){
		int a=10;
		int b=20;
		System.out.println(b/a);
	}

	
	void add() {
		
		System.out.println("add");
	}

	
	void substraction() {
		System.out.println("sub");
		
	}
	
}


public class Abstract_cl2 extends Parent             //concrete class
{
	public static void main(String[] args) {
		Abstract_cl2 ac= new Abstract_cl2();
		ac.add();
		ac.substraction();
		div();
		multiply();
	}

}

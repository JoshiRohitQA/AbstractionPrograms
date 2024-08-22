package abstractprograms;

interface GrandParent1{
	
	void method1();
	void method2();
	
}


abstract class Parent_Class implements GrandParent1{
	
	static void method3() {
		System.out.println("Its a static concrete method");
	}
	
	abstract void method4();

	
	
	
}

public class InterfaceProg2 extends Parent_Class {
	
public void method1() {
		System.out.println("method1 in child class");
		
	}


	public void method2() {
		
		System.out.println("Method2 in child class");
	}
	
	void method4() {
		System.out.println("abstract class method");
	}
	
	
	public static void main(String[] args) {
		InterfaceProg2 ip = new InterfaceProg2();
		ip.method1();
		ip.method2();
		method3();
		ip.method4();
		
	}

}

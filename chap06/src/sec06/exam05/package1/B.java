package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;		// default
		// a.field3 = 1;	// private
		
		a.method1();
		a.method2();		// default
		// a.method3();		// private
	}
}

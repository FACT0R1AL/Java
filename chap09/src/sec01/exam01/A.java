package sec01.exam01;

class A {
	A() {
		System.out.println("A 객체가 생성됌");
	}
	
	public class B {
		B() {
			System.out.println("B 객체가 생성됌");
		}
		
		int field1;
		//static int field2; // 이걸 어케함 못하지
		
		void method1() {}
		//static int method2() {} // 이걸 어케함 못하지
	}
	
	static class C {
		C() {
			System.out.println("C 객체가 생성됌");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D {
			D() {
				System.out.println("D 객체가 생성됌");
			}
			
			int field1;
			//static int field2;
			void method1() {}
			//static int method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

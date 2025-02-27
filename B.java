package sec06.exam02.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1; // X, private 는 같은 클래스에서만 사용가능
		
		a.method1();
		a.method2();
		a.method3(); // X, private 는 같은 클래스에서만 사용가능
	}
}

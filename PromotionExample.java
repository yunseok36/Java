package sec07.exam02;


class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관계에 있지 않기 때문에 컴파일에러 발생
		// 직계가 아니기 때문에 자동타입변환이 일어나지 않아서 컴파일에러 발생
		// B b3 = e;
		// C c2 = d;
	}
}

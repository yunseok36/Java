package sec07.exam02;

public class ChildExample2 {
	public static void main(String[] args) {
		Parent parent2 = new Child();
		parent2.field1 = "data1";
		parent2.method1();
		parent2.method2();
		/* 불가능
		 parent2.field2 = "data2";
		 parent2.method3();
		 */
		
		Child child2 = (Child) parent2;
		child2.field2 = "yyy";
		child2.method3();
	}
}

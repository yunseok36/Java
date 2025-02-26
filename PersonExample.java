package sec06.exam01;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		p1.name = "홍삼원"; // p1의 name에 저장되어 있는 "홍길동"을 "홍삼원"으로 재할당(저장)해줌
	}
}

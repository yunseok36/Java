package sec07.exam01;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name); // 부모에게 상속받은 필드 출력
		System.out.println("ssn : " + student.ssn); // 부모에게 상속받은 필드 출력
		System.out.println("studentNo : " + student.studentNo); // 자녀 객체에 있는 필드 출력
	}
}

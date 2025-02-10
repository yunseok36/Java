package sec03.exam02;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		// s1 이라는 변수에는 Student 객체의 메모리의 주소값을 저장
		
		// s1 과 s2 가 참조하는 Student 객체는 완전히 독립된 서로 다른 객체
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student객체를 참조합니다.");
		// s2 라는 변수에는 Student 객체의 메모리의 주소값을 저장
	}
}

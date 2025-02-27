package sec06.exam01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1= new Student(); // s1 이라는 변수에는 Student 객체의 메모리의 주소값(번지)을 저장
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}

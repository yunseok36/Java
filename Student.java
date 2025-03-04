package sec07.exam01;

public class Student extends People {
	// 필드 선언
	public int studentNo;
	
	// 생성자 선언
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출
		this.studentNo = studentNo;
	}
}

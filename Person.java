package sec06.exam01;

public class Person {
	final String nation = "Korea"; // final 필드인 nation을 선언해줬는데, 이 때 초기값으로 KOREA를 저장
	final String ssn; // final 필드인 ssn을 선언해줬는데, 이 때 초기값을 지정해주지 않음->생성자 부분에서 초기값을 지정해줄 예정
	String name;
	
	public Person(String ssn, String name) { // 메소드의 매개변수로 ssn, name을 지정해준 이유는 필드에서 nation에 KOREA로 초기값을 미리 지정해줬기 때문
		this.ssn = ssn;
		this.name = name;
	}
}

package sec06.exam05;

public class Singleton {
	private static Singleton singleton = new Singleton(); // 필드
	
	private Singleton() {} // 생성자
	
	static Singleton getInstance() { // 메소드
		return singleton;
	}
	
}

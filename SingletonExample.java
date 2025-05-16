package sec06.exam05;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton();
		 Singleton obj2 = new Singleton(); 
		 -> 객체를 2개 생성하여 private를 사용한 싱글톤에서는 컴파일 에러 발생
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance(); // obj1, obj2 는 Singleton 객체의 메모리 주소값
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}

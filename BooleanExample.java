package sec01.exam02;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else { // 지역변수
			System.out.println("시작합니다.");
		}
	}
}

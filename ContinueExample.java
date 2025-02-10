package sec04.exam01;

public class ContinueExample {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 변수 i 를 2로 나눈 나머지가 0이 아닐 경우 (홀수인 경우)
				continue;
			}
			System.out.println(i); // i 가 짝수가 나오면 출력한다.
		}
	}
}

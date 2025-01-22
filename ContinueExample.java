package sec01.exam02;

public class ContinueExample {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if (i%2 != 0) { // 변수 i를 2로 나눈 나머지가 0이 아닐 경우
				continue; // i가 홀수일 경우에는 계속해서 for 반복문을 실행
			}
			System.out.println(i); // i 가 짝수가 나오면 출력
		}
	}
}

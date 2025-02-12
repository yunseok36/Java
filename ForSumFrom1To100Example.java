package sec04.exam01;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; // sum 은 전역변수
		
		for(int i = 1; i <= 100; i++) {
			sum += i; // i 는 지역변수
		}
		System.out.println("1~100 합 : " + sum);
		
	}
}

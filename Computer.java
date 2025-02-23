package sec06.exam01;

public class Computer {
	int sum1(int[] values) { // sum1 메소드를 선언해줌, 이 때 매개변수는 배열임
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ...values) { // sum2라는 메소드의 매개변수가 values 에 값의 목록만 넘겨주는 방법
		int sum = 0;
		for(int i = 0; i < values.length; i++) { // sum2 메소드의 실행문
			sum += values[i];
		}
		return sum;
	}
}

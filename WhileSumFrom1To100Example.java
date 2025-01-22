package sec01.exam02;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while (i <= 100) {
			sum += i; // sum = sum + i;
			i++;
		} // i 가 100까지 돌고 나오면 i = 101 이 되므로. 마지막 결과를 출력할 때 (i-1)을 해줘야 한다.
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}

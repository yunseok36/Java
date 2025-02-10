package sec04.exam01;

public class BreakOutterExample {
	public static void main(String[] args) {
		
		Outter : for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') { // lower 가 'g' 가 되면 break 실행하여 바깥쪽 for 문 까지 빠져나옴
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}

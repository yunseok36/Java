package sec01.exam01;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { // score 가 90보다 작을 경우 
			System.out.println("점수기 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}

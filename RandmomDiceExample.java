package sec04.exam01;

public class RandmomDiceExample {
	public static void main(String[] args) {
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1; // 주사위 1
			int dice2 = (int)(Math.random() * 6) + 1; // 주사위 2
			System.out.println("("+ dice1 + ", " + dice2 +")");
			if((dice1 + dice2) == 5) { // 주사위 합이 5가 나오면 종료
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}

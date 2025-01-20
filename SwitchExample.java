package sec01.exam01;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 뽑는 함수
		
		// case 끝에 break 가 있는 이뉴는 다음 case 를 실행하지 않고 switch 문을 빠져나가기 위함임
		// break 가 없다면 다음 case 가 실행되는데, 이때는 case 값과는 상관없이 실행됨
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default :
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}
}

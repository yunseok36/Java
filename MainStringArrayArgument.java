package sec02.exam02;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
		// 실행할 때 매개값을 주지 않으면 길이 0인 String 배열이 매개값으로 전달됨
		// args.length는 0 이므로 5라인의 if 조건식이 true 가 되어 if문 의 블록이 실행됨
		
		if (args.length != 2) {  // 입력된 데이터 개수가 2개가 아닐 경우
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 프로그램 강제종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + "=" + result);
	}
}

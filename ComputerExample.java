package sec07.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		// 객체 생성_클래스 Calculator 를 참조하기 위해서
		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		// 객체 생성_클래스 Computer 를 참조하기 위해서
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r)); // 재정의된 메소드 호출
	}
}

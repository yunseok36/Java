package sec04.exam01;

import java.util.Scanner;

public class InandOutExample {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			
			System.out.println("-------------------------------");
			System.out.println("선택 > ");
			
			switch(scanner.nextLine()) {
			case "1" :
				System.out.print("예금액 > ");
				balance += Integer.parseInt(scanner.nextLine());
						break;
			case "2" :
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(scanner.nextLine());
						break;
			case "3" :
				System.out.println("잔고 > " + balance);
						break;
			case "4" :
				run = false;
						break;
			default :
					System.out.println("잘못된 선택입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}

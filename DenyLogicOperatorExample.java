package sec02.exam01;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); // true
		
		play = !play;
		System.out.println(play); // false
		
		play = !play;
		System.out.println(play); // true, false 에 ! 가 붙었기 때문에
	}
}

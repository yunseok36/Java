package sec01.exam02;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.println();
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
				
			}
		}
	}
}

package sec02.exam01;

public class compareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 = " + result1); // true
		System.out.println("result2 = " + result2); // false
		System.out.println("result3 = " + result3); // true
		
		char char1 = 'A'; // A -> 65
		char char2 = 'B'; // B -> 66
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4); // true
	}
}

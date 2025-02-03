package sec02.exam01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++; // 10 + 1 => 11, x 먼저 출력 후 + 1
		++x; // 11 + 1 => 12, x 에 + 1 후 출력
		System.out.println("x = " + x); // 11 + 1 => 12
		
		System.out.println("------------------");
		y--; // 10 - 1 => 10, y 먼저 출력 후 - 1
		--y; // 9 - 1 => 8, y 에 - 1 후 출력
		System.out.println("y = " + y); // 8
		
		System.out.println("------------------");
		z = x++; // 12, x = 12 출력 후 + 1 이기 때문에 z 는 아직 12
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13, x = 12 에 + 1 후 출력
		
		System.out.println("------------------");
		z = ++x; // 14, z = 13 에 + 1 후 출력
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14, x = 14 츨력 후 + 1
		
		System.out.println("------------------");
		z = ++x + y++; // z = 14 + 1 = > 15, z = 15 + 8 = > 23 출력 후 y + 1
		System.out.println("z = " + z); // 23
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 9
	}
}

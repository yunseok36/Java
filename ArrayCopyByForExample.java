package sec02.exam02;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3}; // 배열 크기 3
		int[] newIntArray = new int[5]; // 배열 크기 5
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ","); 
			// 배열 복사, 복사되지 않은 항목은 int[] 배열의 기본 초기값 0이 그대로 유지됨
		}
	}
}

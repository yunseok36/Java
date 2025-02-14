package sec05.exam01;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array" , "copy"}; // 변수 길이 3
		String[] newStrArray = new String[5]; // 변수 길이 5
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); 
		// 참조변수 oldStrArray의 인덱스 0부터 끝까지를 참조변수 newStrArray에 인덱스가 0인 곳인 heap 영역에 복사한다.
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", "); // newStrArray 를 0부터 4까지 호출
		}
	}
}

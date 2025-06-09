package sec01.exam04;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception {
		
		// ex) a 를 입력하면 a 에 대한 키코드를 읽음
		int keyCode; 
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}
}

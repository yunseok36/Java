package sec07.exam02;

public class HankookTire extends Tire{

	// 필드 생성
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<max>Rotation) {
			System.out.println(location + " HankookTire 수명 : " + 
		   (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}

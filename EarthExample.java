package sec06.exam01;

public class EarthExample {
	public static void main(String[] args) { // static 으로 필드를 선언해줬기 때문에 객체가 필요없음, 객체 선언이 필요없음
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA + " km^2");
	}
}

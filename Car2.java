package sec06.exam03;

public class Car2 {

	// 필드 생성
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car2() { // 기본 생성자
	}
	
	Car2(String model) {
		this.model = model; // 생성자
	}
	
	Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

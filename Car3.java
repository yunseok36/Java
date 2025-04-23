package sec06.exam03;

public class Car3 {

	// 필드 생성
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car3(){
	}
	
	Car3(String model) { 
		this(model, "은색", 250);
	}
	
	Car3(String model, String color) {
		this(model, color, 250);
	}
	
	Car3(String model, String color, int maxSpeed) { // 공통 실행코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

package sec03.exam02;

public class Car4 {

	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car4() { // 1) 생성자 (기본 생성자)
	} 
	
	Car4(String model) { // 2) 생성자
		this.model = model;
	}
	
	Car4(String model, String color) { // 3) 생성자
		this.model = model;
		this.color = color;
	}
	
	Car4(String model, String color, int maxSpeed) { // 4) 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

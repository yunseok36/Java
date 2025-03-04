package sec07.exam01;

public class DmbCellPhone extends CellPhone {
// 부모클래스 CellPhone 에 있는 필드와 메소드를 DmbCellPhone 에 가져다 쓸 수 있음 : 상속
	
	// 필드 생성
	int channel;
	
	// 생성자 : 객체가 생성될 때 자동으로 호출되는 특수 목적의 멤버함수(메소드)로 객체(인스턴스)의 초기화를 위해 사용함
	// 매개변수 3개 String model, String color, int channel 을 가진 생성자 DmbCellPhone
	DmbCellPhone(String model, String color, int Channel) {
		this.model = model; // this 는 객체 자신의 래퍼런스 변수, this.model은 멤버변수 model 을 나타냄
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}

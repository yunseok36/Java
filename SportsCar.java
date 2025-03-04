package sec07.exam01;

public class SportsCar extends Car {
 @Override
 public void speedUp() { speed += 10; } // speed = speed + 10;
 
 // 재정의 할 수 없음
 @Override
 public void stop() {
	 System.out.println("스포츠카를 멈춤");
	 speed = 0;
	 
	 // 부모클래스 Car 에서 stop 메소드 앞에 final 키워드가 사용됐기 때문에
	 // 자녀클래스 sportCar 에서 재정의 될 수 없다.
 }
}

package sec08.exam02;

public class Driver2Example {
	public static void main(String[] args) {
		Driver2 driver = new Driver2();
		
		Bus2 bus = new Bus2();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}

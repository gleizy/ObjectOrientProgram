
public class Car {

	public Car(String name) {
		this.name = name;
		//carEngine = new Engine();
		leftFrontWheel = new Wheel("leftFront");
		rightFrontWheel = new Wheel("rightFront");
		leftBackWheel = new Wheel("leftBack");
		rightBackWheel = new Wheel("rightBack");
	}
	
	String name;
	
	Wheel leftFrontWheel;
	
	Wheel rightFrontWheel;
	
	Wheel leftBackWheel;
	
	Wheel rightBackWheel;
	
	Body carBody;
	
	Engine carEngine;
	
	void run() {
		System.out.println(name + "���^�]���܂��B");
		if (carEngine == null) {
			carEngine = new Engine();
		}
		carEngine.start();
		leftFrontWheel.run();
		rightFrontWheel.run();
		leftBackWheel.run();
		rightBackWheel.run();
	}
	
	void bre() {
		System.out.println(name + "����~���܂��B");
		leftFrontWheel.bre();
		rightFrontWheel.bre();
		leftBackWheel.bre();
		rightBackWheel.bre();
		carEngine.stop();
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car("�l�̎�");
		
		
		Car yourCar = new Car("���Ȃ��̎�");
		yourCar.run();
		
		Car herCar = new Car("�ޏ��̎�");
		herCar.run();
		

		myCar.run();
		myCar.bre();
	}

}


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
		System.out.println(name + "が運転します。");
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
		System.out.println(name + "が停止します。");
		leftFrontWheel.bre();
		rightFrontWheel.bre();
		leftBackWheel.bre();
		rightBackWheel.bre();
		carEngine.stop();
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car("僕の車");
		
		
		Car yourCar = new Car("あなたの車");
		yourCar.run();
		
		Car herCar = new Car("彼女の車");
		herCar.run();
		

		myCar.run();
		myCar.bre();
	}

}

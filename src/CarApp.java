
public class CarApp {
	public static void main(String[] args) {

		Car wrx = new Car("Blue", "Subaru", "wrx");
		Car toy = new Car();
		System.out.println("Car 1");
		System.out.println(wrx.getCarBrand());
		System.out.println(wrx.getCarColor());
		System.out.println(wrx.getCarModel());

		System.out.println(" ");

		System.out.println("Car 2");
		System.out.println(toy.getCarBrand());
		System.out.println(toy.getCarColor());
		System.out.println(toy.getCarModel());

		System.out.println(" ");

		System.out.println(wrx.startCar());
		System.out.println(toy.startCar());

		System.out.println(" ");

		System.out.println(wrx.accelerate());
		System.out.println(toy.accelerate());

		System.out.println(" ");

		wrx.setSpeed(70);
		toy.setSpeed(30);
		System.out.println(wrx.getSpeed());
		System.out.println(toy.getSpeed());
		System.out.println("The WRX is in the Lead!");

		System.out.println(" ");

		System.out.println(wrx.startNitrous(200));
		toy.setSpeed(70);
		System.out.println(toy.getSpeed());
		
		System.out.println(" ");
		
		System.out.println(wrx.stopCar());
		System.out.println("Its over ladies an Gents the WRX smoked the poor toyota");
		System.out.println(toy.stopCar());
	}
}


public class Car {

	private String carBrand;
	private String carColor;
	private String carModel;
	private int speed;
	private String nitrous;
	
	public Car(){
		this.carColor = "Tan";
		this.carBrand = "Toyota";
		this.carModel = "corolla";
	}

	public Car(String color, String brand, String model) {
		this.carColor = color;
		this.carBrand = brand;
		this.carModel = model;
	}

	public String getCarColor() {
		return "The car color is " + carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarBrand() {
		return "The car manufacturer is " + carBrand;
	}

	public String getSpeed() {
		return "The " +  carBrand + " " +carModel + " is going " + speed + "mph!";
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
		
	public String startCar(){
		return "The " + carModel + " is starting"; 
	}
	
	public String stopCar(){
		return "The " + carModel + " is stopping"; 
	}
	
	public String accelerate(){
		return "The " +  carBrand + " " +carModel + " is accelerating";
	}

	public String getCarModel() {
		return "The model of the car is a " + carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String startNitrous(int nitrousSpeed) {
		this.speed = nitrousSpeed;
		return "The " +  carBrand + " " +carModel + " is now using NITROUS! ITS NOW GOING " + speed + " mph!!!";
	}

	
	
}

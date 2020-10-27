
public class UsedCars extends Car{
     private double mileage;


	
	
	public UsedCars(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public UsedCars() {
		super();
		
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + "(Used)"+getMake() + getMileage();
	}

	

	
	
	


}

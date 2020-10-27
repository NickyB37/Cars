import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		List<Car> newAndusedCar = new ArrayList<>();
		UsedCars a = new UsedCars("Ford", "Taurus", 2010, 17000.00, 1400.00);
		newAndusedCar.add(a);
		Car b = new Car("Ford", "Fusion", 2011, 10000.00);
		newAndusedCar.add(b);
		UsedCars c = new UsedCars("Porche", "Cayenne", 2015, 22000.00, 104000.00);
		newAndusedCar.add(c);
		Car d = new Car("Ford", "F150", 2009, 10000.00);
		newAndusedCar.add(d);
		UsedCars e = new UsedCars("Nissan", "Rouge", 2016, 17000.00, 1400.00);
		newAndusedCar.add(e);
		Car f = new Car("Honda", "Civic", 1987, 10500.00);
		newAndusedCar.add(f);
		int i = 1;
		for (Car usedcar : newAndusedCar) {
			if (usedcar instanceof Car) {
				System.out.println(
								i + "." + usedcar.getMake() + usedcar.getModel() + usedcar.getYear() + usedcar.getPrice());
				i++;
				System.out.println("");
			} else if (usedcar instanceof UsedCars) {
				System.out.println(i + "." + usedcar.getMake() + usedcar.getModel() + usedcar.getYear()
						+ usedcar.getPrice() + ((UsedCars) usedcar).getMileage());
				i++;

			}

		}
		System.out.println("7" + "." + "Quit");

		System.out.println("which car would you like ");
		int userInput = scnr.nextInt();
		if (userInput > 0 || userInput < 7) {
			System.out.println(newAndusedCar.get(userInput-1));
		} else {
			System.out.println("goodbye");
		}

	    scnr.nextLine();
		boolean keepgoing = true;
	    while (keepgoing = true) {
			System.out.println(" Make purchase y/n?");
			String ok = scnr.nextLine();
			if (ok.equalsIgnoreCase("y")) {
				
				for (Car usedcar : newAndusedCar) {
					
					newAndusedCar.remove(usedcar.getMake());
					
				}
				System.out.println("Excellent! Our finance department will be in touch shortly");
				
				System.out.println(newAndusedCar);
			} else {
				keepgoing = false;
				System.out.println("goodbye");
			} 
		}
		
		
		}

}
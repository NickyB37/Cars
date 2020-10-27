import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		List<Car> cars = new ArrayList<>();

		while (Validator.getYesNo(scnr, "Would you like to add a car? ")) {

			Car cart = new Car();
			System.out.println("Enter make");
			String make = scnr.nextLine();
			cart.setMake(make);
			System.out.println("Enter model");
			String model = scnr.nextLine();
			cart.setModel(model);
			System.out.println("Enter year");
			int year = scnr.nextInt();
			cart.setYear(year);
			System.out.println("Enter price");
			double price = scnr.nextDouble();
			cart.setPrice(price);
			cars.add(cart);
		}
		for (Car car : cars) {
			System.out.println(car);
		}

	}

}

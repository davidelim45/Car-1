package car123;

public class CarApp {
	  public static void main(String[] args) {
	        
	        Car defaultCar = new Car();

	        
	        Car paramCar = new Car("Toyota", "Camry", 2022);

	        
	        System.out.println("Default Car Details: " + defaultCar);
	        System.out.println("Parametrized Car Details: " + paramCar);
	    }
	}



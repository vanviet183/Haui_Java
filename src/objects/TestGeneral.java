package objects;

public class TestGeneral {

	public static void print(General g) {
		if(g instanceof Car) {
			System.out.println(((Car)g).getTechnical());
		} else if(g instanceof Animal) {
			System.out.println(((Cat)g).getInfo());
		}
	}
	
	public static void main(String[] args) {
		
		Car car = new TourCar();
		Animal a = new Cat();
		TestGeneral.print(car);
	}
}

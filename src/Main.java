import Interfaces.Serviceable;
import Transports.Bicycle;
import Transports.Car;
import Transports.Truck;

public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 2);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Serviceable[] transport = {car, car2, truck, truck2, bicycle, bicycle2};

        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);

    }
}
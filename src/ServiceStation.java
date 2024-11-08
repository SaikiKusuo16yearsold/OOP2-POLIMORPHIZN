import Transports.Transports;
import Transports.Truck;
import Transports.Car;

public class ServiceStation {
    public void check(Transports transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        if (transport instanceof Truck) {
            ((Truck) transport).checkEngine();
            ((Truck) transport).checkTrailer();
        } else if (transport instanceof Car) {
            ((Car) transport).checkEngine();

        }
    }
}
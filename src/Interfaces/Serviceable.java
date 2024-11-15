package Interfaces;

import Transports.Car;
import Transports.Transports;
import Transports.Truck;

public interface Serviceable {

    default void service(Transports transport) {
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
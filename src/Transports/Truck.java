package Transports;

import Interfaces.Serviceable;

public class Truck extends Transports implements Serviceable {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service(Transports transport) {
        super.service(transport);
        checkEngine();
        checkTrailer();
    }
}
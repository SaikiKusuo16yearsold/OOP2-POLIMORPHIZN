package Transports;

import Interfaces.Serviceable;

public class Car extends Transports implements Serviceable {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    @Override
    public void service(Transports transport) {
        super.service(transport);
        checkEngine();
    }
}




package Transports;

import Interfaces.Serviceable;

public class Bicycle extends Transports implements Serviceable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service(Transports transport) {
        super.service(transport);
    }
}
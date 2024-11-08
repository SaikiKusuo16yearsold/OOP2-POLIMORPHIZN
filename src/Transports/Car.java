package Transports;

import Interfaces.EngineCheckable;
import Interfaces.Serviceable;

public class Car extends Transports implements Serviceable, EngineCheckable {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



}




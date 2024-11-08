package Transports;

import Interfaces.EngineCheckable;
import Interfaces.Serviceable;
import Interfaces.TrailerCheckable;

public class Truck extends Transports implements Serviceable, EngineCheckable, TrailerCheckable {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}